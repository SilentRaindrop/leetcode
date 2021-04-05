//实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
// 输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
//注意每个输入文件有多组输入，即多个字符串用回车隔开

package 华为机试题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HJ23 {
    public static void main(String[] args) {
        //先使用hashmap记录每个字母出现次数
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String ss=scanner.nextLine();
            StringBuilder str=new StringBuilder();
            Map<Character,Integer> map=new HashMap<>();
            int n=ss.length();
            for(int i=0;i<n;i++){
                map.put(ss.charAt(i),map.getOrDefault(ss.charAt(i),0)+1);
            }
            int count=Integer.MAX_VALUE;
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue()<count) count=entry.getValue();
            }
            //遍历map，如果键对应的值不等于最小值的话，就输出
            for(int i=0;i<n;i++){
                if(map.get(ss.charAt(i))!=count){
                    str.append(ss.charAt(i));
                }
            }
            System.out.println(str);
        }
    }
}
