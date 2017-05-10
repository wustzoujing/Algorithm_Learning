/**
 * Created by zoujing on 2017/5/10.
 */
public class ArraySearch_1 {
    public boolean Find(int target, int [][] a) {
        // 右上角初始值，第一行最后一列。
        int j=a[0].length-1;
        int i=0;
        //循环条件
        while((j>=0)&&i<a.length){
            //大于目标值，该行之后肯定都大于目标值，只会在该行，减少列数查找
            if(a[i][j]>target)
                --j;
                //小于目标指，则该行全小于目标值，往下一行查找
            else if(a[i][j]<target)
                ++i;
                //相等返回true
            else
                return true;
        }
        //循环结束还未返回true，则返回false。
        return false;
    }

    public boolean Find2(int target, int [][] a) {
        //左下角初始值，最后一行，第一列
        int i=a.length-1;
        int j=0;
        //循环条件
        while((i>=0)&&j<a[0].length){
            //大于目标值则该行都大于目标值，往上一行查找。
            if(a[i][j]>target)
                --i;
                //小于目标值，则该行之前都小于目标值，结果只会在该行，再增加列数查找
            else if(a[i][j]<target)
                ++j;
                //相等返回true
            else
                return true;
        }
        //循环结束还未返回true，则返回false。
        return false;
    }
}
