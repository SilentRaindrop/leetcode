package list;

import java.util.ArrayList;
import java.util.List;
//判断回文数
public class leetcode234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> array=new ArrayList<>();
        ListNode l=head;
        while(l!=null){
            array.add(l.val);
            l=l.next;
        }
        int low=0;
        int high=array.size()-1;
        boolean flag=true;
        while(low<high){
            if(!array.get(low).equals(array.get(high)))
                flag=false;
            low++;
            high--;
        }
        return flag;
    }
}