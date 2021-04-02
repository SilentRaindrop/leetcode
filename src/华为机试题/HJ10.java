package 华为机试题;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
// 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
public class HJ10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int n=str.length();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(str.charAt(i));
        }
        System.out.println(set.size());
    }
}
