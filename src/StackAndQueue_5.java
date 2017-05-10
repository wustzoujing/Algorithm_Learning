import java.util.Stack;

/**
 * Created by zoujing on 2017/5/10.
 */
public class StackAndQueue_5 {
    //定义两个栈
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    //进队都往第一个栈进。
    public void push(int node) {
        stack1.push(node);
    }
    //出队列函数
    public int pop() {
        //如果栈1不为空，把栈1值导入栈2，完成逆序
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        //栈2栈顶出队列
        int first=stack2.pop();
        //这里是重点：栈2的值都要倒回栈1，因为如果不倒回，出队列操作之后，栈2还有元素，但是之
        //后进队列的元素又倒回栈2，这样就乱序了，倒回保证每次栈2中先进的都在下面，整体倒入栈2
        //后肯定保证是先进的元素在栈顶
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        //
        return first;
    }
}
