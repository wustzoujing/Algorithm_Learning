/**
 * Created by zoujing on 2017/5/15.
 */
public class FindKthToTail_14 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {

        if(head==null||k<=0){
            return null;
        }
        ListNode n1=head;

        ListNode n2=head;
        for(int i=1;i<k;i++){
            if(n1.next!=null){
                n1=n1.next;
            }else{
                return null;
            }
        }
        while(n1.next!=null){
            n1=n1.next;
            n2=n2.next;
        }
        return n2;
    }
}
