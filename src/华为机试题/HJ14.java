//输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
package 华为机试题;

import java.util.*;

public class HJ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = new TreeMap<String,Integer>();
        int n = scanner.nextInt();
        for(int i = 0;i < n;i ++) {
            String s = scanner.next();
            map.put(s,map.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            for(int i = 0;i < entry.getValue();i ++) {
                System.out.println(entry.getKey());
            }
        }
        scanner.close();
    }
}