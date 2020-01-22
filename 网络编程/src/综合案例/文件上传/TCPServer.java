package 综合案例.文件上传;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    文件上传案例的服务器端:读取客户端上传的文件,保存到服务器的硬盘,给客户端回写"上传成功"

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

        /*
            让服务器一致处于监听状态(死循环accept方法)
            有一个客户端上传文件,就保存文件
         */
        while (true) {
            //2.使用 ServerSocket 对象的方法 accept,获取请求的客户端Socket对象
            Socket socket = server.accept();

            /*
                使用多线程技术,提高程序效率
                有一个客户端上传文件,就开启一个线程,完成文件的上传
             */

            new Thread(new Runnable() {
                // 文件的上传
                @Override
                public void run() {

                    /*
                        因为 run()方法没有抛出 IOException 异常,所以只能用 try catch处理异常
                     */

                    try {
                        //3.使用Socket对象中的方法 getInputStream,获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //4.判断G:\\upload文件夹是否存在,不存在则创建一个
                        File file = new File("G:\\upload");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String fileName = "coder" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";


                        /*
                            自定义文件命名规则:防止同名的文件被覆盖
                            规则:域名+毫秒值+随机数
                         */

                        //5.创建一个本地字节输出流 FileOutputStream 对象,构造方法绑定要输出的目的地
                        FileOutputStream fos = new FileOutputStream(file + File.separator + fileName);
                        //6.使用网络字节输入流 InputStream对象中的 read,读取客户端上传的文件
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
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
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
        //服务器就不用关闭了, 因为要一直监听
//        server.close();
    }
}
