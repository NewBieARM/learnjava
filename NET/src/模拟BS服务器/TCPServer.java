package 模拟BS服务器;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建BS版本的TCP服务器
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        /*
            浏览器解析服务器回写的htm页面,页面如果有图片,那么浏览器会单独的开启一个线程,读取服务器
            我们就让服务器一致处于监听状态,客户端请求一次,服务器就会写一次
         */
        while (true) {

            Socket socket = server.accept();
            InputStream is = socket.getInputStream();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // 把 is 网络字节输入流对象,转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
//                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求信息的第一行读取出来
                        String line = br.readLine();
                        //把读取的信息进行切割, 只要中间的部分

                        System.out.println(line);

                        String[] arr = line.split(" ");
                        //路径前面的 / 去掉,进行截取
                        String html_path = arr[1].substring(1);

                        // 创建一个本地的字节输入流,构造方法绑定html路径
                        FileInputStream fis = new FileInputStream(html_path);

                        OutputStream os = socket.getOutputStream();

                        // 固定的三行
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());

                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }

                        br.close();
                        fis.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();

        }
    }
}
