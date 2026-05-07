//使用 BufferedReader 在控制台读取字符

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        int c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        
        while ((c = br.read()) != -1) {
            char ch = (char) c;
            if (ch == 'q') {
                break;
            }
            System.out.println(ch);
        }
        br.close();
    }
}