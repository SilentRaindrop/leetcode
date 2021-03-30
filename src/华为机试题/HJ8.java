package 华为机试题;

import java.util.*;

//数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，
// 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            int key=scanner.nextInt();
            int value=scanner.nextInt();
            if(map.containsKey(key))
                map.put(key,map.get(key)+value);
            else
                map.put(key,value);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());
    }
}
