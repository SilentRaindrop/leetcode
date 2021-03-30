package 华为机试题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
//•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
public class HJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list=new ArrayList<>();
        //先把所有的输入字符串都加到StringBuilder上，然后让它的长度为8的倍数，最后按照长度为8一段一段切就好了
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();//牢记字符串缓冲区的建立语法
            sb.append(str);//字符串缓冲区的加入
            int size = str.length();
            int addZero = 8 - size%8;//addzero的可能值包括8
            while((addZero > 0)&&(addZero<8)){//注意边界调节，避免addzero=8
                sb.append("0");//使用‘’或“”都可
                addZero--;
            }
            String str1 = sb.toString();
            while(str1.length()>0){
                list.add(str1.substring(0,8));
                str1 = str1.substring(8);
            }
        }
        for(String s:list)
            System.out.println(s);
    }
}