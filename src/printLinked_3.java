import java.util.ArrayList;

/**
 * Created by zoujing on 2017/5/10.
 */
public class printLinked_3 {

        public class ListNode {
             int val;
             ListNode next = null;

             ListNode(int val) {
                 this.val = val;
             }
         }


    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //递归结束条件
        if(listNode!=null){
            //递归打印它的next数组
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}
