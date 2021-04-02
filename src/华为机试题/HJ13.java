package 华为机试题;

import java.util.Scanner;

//将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
//所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
public class HJ13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int l=str.length()-1;
        //从后往前遍历，遇到空格停止
        int r=l;
        StringBuilder ss=new StringBuilder();
        while(l>=0){
            while (l>=0&&str.charAt(l)!=' ') l--;
            ss.append(str.substring(l+1,r+1));
            ss.append(" ");
            l--;
            r=l;
        }
        System.out.println(ss);
    }
}
