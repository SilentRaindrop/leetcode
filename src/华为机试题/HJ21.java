package 华为机试题;

import java.util.Scanner;

//输入明文，输出密文
public class HJ21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int n=str.length();
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                if(str.charAt(i)>='a'&&str.charAt(i)<='c') ss.append('2');
                else if(str.charAt(i)>='d'&&str.charAt(i)<='f') ss.append('3');
                else if(str.charAt(i)>='g'&&str.charAt(i)   <='i') ss.append('4');
                else if(str.charAt(i)>='j'&&str.charAt(i)<='l') ss.append('5');
                else if(str.charAt(i)>='m'&&str.charAt(i)<='o') ss.append('6');
                else if(str.charAt(i)>='p'&&str.charAt(i)<='s') ss.append('7');
                else if(str.charAt(i)>='t'&&str.charAt(i)<='v') ss.append('8');
                else ss.append('9');
            }
            if(str.charAt(i)>='0'&&str.charAt(i)<='9') ss.append(str.charAt(i));
            if(str.charAt(i)>='A'&&str.charAt(i)<='Y') ss.append((char)(str.charAt(i)+33));
            if(str.charAt(i)=='Z') ss.append('a');
        }
        System.out.println(ss);
    }
}
