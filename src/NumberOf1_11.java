/**
 * Created by zoujing on 2017/5/15.
 */
public class NumberOf1_11 {
    public int NumberOf1(int n) {

        int count=0;
        while(n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;
    }
}
