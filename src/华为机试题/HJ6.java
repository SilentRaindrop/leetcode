package 华为机试题;

import java.util.Scanner;

//功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
//最后一个数后面也要有空格
public class HJ6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        if(isPrime(n)) {
            System.out.printf(n+" ");
            return;
        }
        for(long i=2;i*i<=n;i++){
            if(!isPrime(i)) continue;
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(isPrime(n)) System.out.println(n);
    }
    //如果一个数已经不能整除2了，那么这个数肯定不能整除2的倍数，所以此题不需要判断除数是否为质数，因为从小到大来说，如果一个数不能被
    //2整除，同样也不能被其他2的倍数整除，所以不需要判断除数是否为质数！！！
    public static boolean isPrime(long num){//质数：除了1和本身之外没有其他因子
        if(num==1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
