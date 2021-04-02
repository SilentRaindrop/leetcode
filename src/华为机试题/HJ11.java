package 华为机试题;


import java.util.Scanner;

//输入一个整数，将这个整数以字符串的形式逆序输出
//程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
public class HJ11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        StringBuilder ss=new StringBuilder(str);
        System.out.println(ss.reverse());
    }
}
