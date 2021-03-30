package 华为机试题;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(str=="null" ||str.isEmpty()){
            System.out.println("0");
            return ;
        }

        String[] buff=str.split(" ");
        System.out.println(buff[buff.length-1].length());
    }
}