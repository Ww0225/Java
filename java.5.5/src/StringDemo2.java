/**
 * @author 28953
 * @create 2023-05-05 21:34
 */
public class StringDemo2 {
    public static void main(String[] args) {
        StringDemo2 stringDemo2 = new StringDemo2();
        String str1 = "abcwerthelloyuiodefabcdef";
        String str2 = "cvhellobnm";
        String str = stringDemo2.getMaxSameStr(str1,str2);
        System.out.println(str);
    }
    public String getMaxSameStr(String str1,String str2){
        if(str1!=null&&str2!=null){
            String maxStr = (str1.length()>=str2.length())?str1:str2;
            String minStr = (str1.length()<str2.length())?str1:str2;
            int length = minStr.length();
            for(int i = 0;i<length;i++){
                for(int x = 0,y = length-i;y<=length;x++,y++){
                    String subStr = minStr.substring(x,y);
                    if(maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }
        }
        return null;
    }
}
