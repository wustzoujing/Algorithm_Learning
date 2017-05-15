/**
 * Created by zoujing on 2017/5/15.
 */
public class reOrderArray_13 {
    public void reOrderArray(int [] array) {
        int [] result = new int[array.length];
        int numOfOdd = 0;
        int numOfEven = 0;
        for(int i=0;i<array.length;i++){
            if((array[i]&0x1) == 1){
                numOfOdd++;
            }else{
                numOfEven++;
            }
        }

        int indexOfOdd = 0;
        int indexOfEven = numOfOdd;
        for(int i=0;i<array.length;i++){
            if((array[i]&0x1) == 1){
                result[indexOfOdd++] = array[i];
            }else{
                result[indexOfEven++] = array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            array[i] = result[i];
        }
    }
}
