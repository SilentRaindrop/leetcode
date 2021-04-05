package 华为机试题;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//密码要求:
//1.长度超过8位
//2.包括大小写字母.数字.其它符号,以上四种至少三种
//3.不能有相同长度大于2的子串重复
public class HJ20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            char[] arr=str.toCharArray();
            int n=str.length();
            if(n<=8) System.out.println("NG");
            Set<Integer> set=new HashSet<>();
            for(char c:arr){
                if(c>='0'&&c<='9') set.add(0);
                else if(c>='a'&&c<='z') set.add(1);
                else if(c>='A'&&c<='Z') set.add(2);
                else set.add(3);
            }
            int l=0,r=3;

            if(set.size()>=3&&!getString(str,0,3) ) System.out.println("OK");
            else System.out.println("NG");
        }
    }
    public static boolean getString(String str,int l,int r){
        if(r>=str.length()) return false;
        if(str.substring(r).contains(str.substring(l,r))) return true;
        else return getString(str,l+1,r+1);
    }
}
