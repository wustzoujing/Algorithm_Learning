/**
 * Created by zoujing on 2017/5/10.
 */
public class Fibonacci_7 {

    public int Fibonacci(int n) {

        if(n<1)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int a=1,b=1,reslut=0;
        for(int i=3;i<=n;++i){
            reslut=a+b;
            a=b;
            b=reslut;
        }
        return reslut;
    }


    public int JumpFloor(int target) {

        if(target<=0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int a=1,b=2,c=0;
        for(int i=3;i<=target;i++){
            c=b+a;
            a=b;
            b=c;
        }
        return c;
    }


    public int JumpFloorII(int target) {

        if(target<=0){
            return 0;
        }
        else{
            int c=1;
            for(int i=1;i<target;i++){
                c=2*c;
            }
            return c;
        }
    }
    public int RectCover(int target) {

        if(target<=0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int a=1,b=2,c=0;
        for(int i=3;i<=target;i++){
            c=b+a;
            a=b;
            b=c;
        }
        return c;
    }


}
