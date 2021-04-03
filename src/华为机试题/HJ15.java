package 华为机试题;

import java.util.Scanner;

//输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数

public class HJ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0) {
            count ++;
            n = n & (n - 1);
        }
        System.out.println(count);
        scanner.close();
    }
}