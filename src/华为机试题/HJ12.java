package 华为机试题;

import java.util.Scanner;

//接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
public class HJ12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder ss=new StringBuilder(s);
        System.out.println(ss.reverse());
    }
}
