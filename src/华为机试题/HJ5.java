package 华为机试题;
//写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。

import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            System.out.println(Integer.valueOf(str.substring(2),16).toString());
            //Integer.valueOf(string,radix)方法说明：
            //第一个参数是字符串，第二个参数是基数，作用是把字符串转成指定进制的数
            //类似的还有parseInt(String s,int radix)
        }
    }
}
