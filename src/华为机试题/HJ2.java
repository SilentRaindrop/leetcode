package 华为机试题;

import java.util.Locale;
import java.util.Scanner;

//写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，
// 然后输出输入字符串中该字母的出现次数。不区分大小写。
public class HJ2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char s=scanner.next().charAt(0) ;
        str=str.toLowerCase();
        if(s>='A'&& s<='Z') s+=32;
        /*
        * 这里一开始我写的是s=s+32，但是报错了，需要我强制转换为char，结果还是不对，但是改为+=就可以了，因为+=是JAVA
        * 规定的运算符，编译器做了特殊处理，会把右边的数值自动强制转换为左边的类型，然后在那块内存上强制直接修改数值
        * 而普通的=是会在把后面的数值赋值到前面的变量时检测类型是否相同（ 非自动强制转换！）
        * 如果是高精度到低精度的，将会报错，告诉程序员会loss of data
        * */
        int count=0;
        for(int i=0;i<str.length();i++){
            if(s==str.charAt(i))
                count++;
        }
        System.out.println("输入字符串中含有该字符的个数位："+count);
    }
}
