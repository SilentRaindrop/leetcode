package 华为机试题;

//输入一个数的近似值，按四舍五入
import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double s=scanner.nextDouble();
        int res= (int) Math.floor(s+0.5);
        System.out.println(res);
    }
}
