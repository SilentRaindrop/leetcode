package 华为机试题;


import java.util.Scanner;

//A10;S20;W10;D30;X;A1A;B10A11;;A10;
//输出：10，-10
public class HJ17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=0,y=0;
        String s = scanner.nextLine();
        String[] str=s.split(";");
        int n=str.length;
        for(int i=0;i<n;i++){
            //如果第一位不是WASD则下一个
            if(str[i]==null||str[i].length()==0) i++;
            if(str[i].charAt(0)!='A'&&str[i].charAt(0)!='W'&&str[i].charAt(0)!='S'&&str[i].charAt(0)!='D')
                i++;
            //如果第二位开始的剩余字符不是数字则下一个
            String substr=str[i].substring(1);
            for(int j=0;j<substr.length();j++){
                if(!Character.isDigit(substr.charAt(j))){
                    i++;
                    break;
                }
            }
            if(str[i].charAt(0)=='A') x-=Integer.parseInt(str[i].substring(1));
            if(str[i].charAt(0)=='D') x+=Integer.parseInt(str[i].substring(1));
            if(str[i].charAt(0)=='W') y+=Integer.parseInt(str[i].substring(1));
            if(str[i].charAt(0)=='S') y-=Integer.parseInt(str[i].substring(1));
        }
        System.out.println(x+","+y);
    }
}
