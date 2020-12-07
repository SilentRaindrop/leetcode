package string;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {

        //两边扩散，如果mid-1不与左边配对则一定与mid+1配对
       /* int start=0;
        int end=s.length();
        int mid=(start+end)/2;*/
        //中间两个数必然配对
        //旁边的数不是与左边的配对就是与mid+2配对
        //对不起，思路是这个思路但是我写不出来-_-!
        //参照一位大神的做法吧。。。
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray())//遍历字符串，遇到一个左括号就把相应的右括号入栈
        {
            if (c == '(') stack.push(')');//单字符用单引号
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
                //遍历一半后左括号必然遍历完成，这时用栈中数据与剩下的右括号比较，相同即可
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
public  class leetcode20 {
    public static void main(String[] args) {
        String s = "{}{}()[]";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));

    }
}

