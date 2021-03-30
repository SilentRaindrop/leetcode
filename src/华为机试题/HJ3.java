package 华为机试题;

import org.w3c.dom.ls.LSException;

import java.util.*;

//输入描述:
//注意：输入可能有多组数据(用于不同的调查)。每组数据都包括多行，第一行先输入随机整数的个数N，
// 接下来的N行再输入相应个数的整数。
//输出描述:
//返回多行，处理后的结果
public class HJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //使用TreeSet集合，能够实现去重和排序两个功能
        int n;
        List<Set<Integer>> list=new ArrayList<>();
        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            Set<Integer> set=new TreeSet<>();
            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }
            list.add(set);
        }
        //遍历出每个list中的set
        for(Set<Integer> set:list){//取出每个set
            for(int num:set)//遍历每个set中的数据
                System.out.println(num);
        }
    }
}
