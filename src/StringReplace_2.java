/**
 * Created by zoujing on 2017/5/10.
 */
public class StringReplace_2 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder newstr =new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' )
                newstr.append("%").append("2").append("0");
            else
                newstr.append(str.charAt(i));
        }
        return newstr.toString();
    }
}
