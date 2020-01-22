package 综合案例.文件上传;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    文件上传案例的服务器端:读取客户端上传的文件,保存到都武器的硬盘,给客户端回写"上传成功"

    明确:
        数据源:客户端上传的文件
        目的地:服务器的硬盘  G:\\upload\\1.jpg

    步骤:
        1.创建一个服务器 ServerSocket 对象,和系统要指定的端口号
        2.使用 ServerSocket 对象的方法 accept,获取请求的客户端Socket对象
        3.使用Socket对象中的方法 getInputStream,获取到网络字节输入流InputStream对象
        4.判断G:\\upload文件夹是否存在,不存在则创建一个
        5.创建一个本地字节输出流 FileOutputStream 对象,构造方法绑定要输出的目的地
        6.使用网络字节输入流 InputStream对象中的 read,读取客户端上传的文件
        7.使用网络字节输出流 OutputStream对象中的 write,把读取到的文件保存到服务器的硬盘上
        8.使用Socket对象中的方法 getOutputStream,获取网络字节输出流 OutputStream对象
        9.使用网络字节输出流 OutputStream对象,给客户端回写"上传成功"
        10.释放资源(FileOutputStream,Socket, ServerSocket)

 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器 ServerSocket 对象,和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //2.使用 ServerSocket 对象的方法 accept,获取请求的客户端Socket对象
        Socket socket = server.accept();
        //3.使用Socket对象中的方法 getInputStream,获取到网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //4.判断G:\\upload文件夹是否存在,不存在则创建一个
        File file = new File("G:\\upload");
        if (!file.exists()){
           file.mkdirs();
        }
        //5.创建一个本地字节输出流 FileOutputStream 对象,构造方法绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream(file + File.separator +"1.jpg");
        //6.使用网络字节输入流 InputStream对象中的 read,读取客户端上传的文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes))!=-1){
            //7.使用网络字节输出流 OutputStream对象中的 write,把读取到的文件保存到服务器的硬盘上
            fos.write(bytes, 0, len);
        }
        //8.使用Socket对象中的方法 getOutputStream,获取网络字节输出流 OutputStream对象
        OutputStream os = socket.getOutputStream();
        //9.使用网络字节输出流 OutputStream对象,给客户端回写"上传成功"
        os.write("上传成功".getBytes());
        //10.释放资源(FileOutputStream,Socket, ServerSocket)
        fos.close();
        socket.close();
        server.close();
    }
}
