/**
 * 获取subStr在mainStr中出现的次数
 * @author 28953
 * @create 2023-05-05 21:08
 */
public class StringDemo1 {
    public static void main(String[] args) {
        StringDemo1 stringDemo1 = new StringDemo1();
        String mainStr = "abkkcadkabkebfkaabkskab";
        String subStr = "ab";
        int count = stringDemo1.getCount(mainStr,subStr);
        System.out.println(count);
    }
    public int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if(mainLength>=subLength){
            while((index = mainStr.indexOf(subStr,index))!=-1){
                count++;
                index += subLength;
            }
            return count;
        }else{
            return 0;
        }
    }
}
