package 综合案例.文件上传;

import java.io.*;
import java.net.Socket;

/*
    文件上传案例的客户端:读取本地文件,上传到服务器,去读服务器些的数据

    明确:
        数据源: G:\my_share\code\picture.jpg
        目的地: 服务器

    实现步骤:
        1.读取一个本地的字节输入流 FileInputStream 对象,构造方法绑定要读取的数据源
        2.创建客户端 Socket 对象,构造方法中绑定服务器的ip地址和端口号
        3.使用 getOutputStream,获取网络字节输出流 OutputStream 对象
        4.使用本地的字节输入流 FileInputStream 对象对象中的read,读取本地文件
        5.使用网络字节输出流 OutputStream 对象中的方法 write,把读取到的文件上传到服务器
        6.使用 getInputStream,获取网络字节输入流 InputStream 对象
        7.使用网络字节输入流 InputStream 对象的方法 read 读取服务器回写的数据
        8.释放资源(FileInputStream, Socket)
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.读取一个本地的字节输入流 FileInputStream 对象,构造方法绑定要读取的数据源
        FileInputStream fis = new FileInputStream(new File("G:\\my_share\\code\\picture.jpg"));
        //2.创建客户端 Socket 对象,构造方法中绑定服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1", 8888);
        //3.使用 getOutputStream,获取网络字节输出流 OutputStream 对象
        OutputStream os = socket.getOutputStream();
        //4.使用本地的字节输入流 FileInputStream 对象对象中的read,读取本地文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            //5.使用网络字节输出流 OutputStream 对象中的方法 write,把读取到的文件上传到服务器
            os.write(bytes, 0, len);
        }

        /*
            解决:上传完文件,给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于TCP套接字，任何先前写入的数据将被发送，随后是TCP的正常连接终止序列。
         */
        socket.shutdownOutput();


        //6.使用 getInputStream,获取网络字节输入流 InputStream 对象
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = 0;
        while ((len1 = is.read(bytes1))!=-1) {
            //7.使用网络字节输入流 InputStream 对象的方法 read 读取服务器回写的数据
            System.out.println(new String(bytes1, 0, len1));
        }
        //8.释放资源(FileInputStream, Socket)
        fis.close();
        socket.close();
    }
}
