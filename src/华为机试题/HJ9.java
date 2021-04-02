package 华为机试题;


import java.util.Scanner;


//输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
//保证输入的整数最后一位不是0。
public class HJ9 {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Set<Integer> set=new TreeSet<>();
        while(num!=0){
            int res=num%10;
            num=num/10;
            set.add(res);
        }
        int ult = 0;
        for(int n:set)
        {
            ult*=10;
            ult+=n;

        }
        System.out.println(ult);*/
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        char[] arr=(num+"").toCharArray();
        String str="";
        for(int i= arr.length-1; i>= 0;i--){
            if(!str.contains(arr[i]+"")){
                str +=arr[i];
            }
        }
        System.out.println(Integer.valueOf(str));
    }
}