package 转换流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Practice {
    public static void main(String[] args) throws IOException {
        gbkToUtf_8();
    }

    private static void gbkToUtf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\my_share\\code\\gbk.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\my_share\\code\\gbkToUtf-8.txt"), StandardCharsets.UTF_8);

        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }

        isr.close();
        osw.close();
    }
}
