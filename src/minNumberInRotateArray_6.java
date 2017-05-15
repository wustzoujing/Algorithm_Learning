/**
 * Created by zoujing on 2017/5/10.
 */
public class minNumberInRotateArray_6 {

    public int minNumberInRotateArray(int [] array) {

        //定义两个标志指向首位索引
        int low = 0 ; int high = array.length - 1;
        //结束条件
        while(low < high){
            //取中间元素
            int mid = low + (high - low) / 2;
            //中间元素比尾数大，最小值在后半段
            if(array[mid] > array[high]){
                low = mid + 1;

            }
            //如果相等，高位减1
            else if(array[mid] == array[high]){
                high = high - 1;
            }
            //如果中间元素比尾数小，最小值在前半段
            else{
                high = mid;
            }
        }
        //循环结束，低位标志就是最小值所在
        return array[low];

    }


}
