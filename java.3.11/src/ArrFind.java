public class ArrFind {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA","BB","CC","DD","EE"};
        String dest = "BB";
        boolean isFlag = true;
        for(int i = 0;i < arr.length;i++)
        {
            if(dest.equals(arr[i]))
            {
                System.out.println("找到了指定的元素，位置为:" + i);
                isFlag = false;
                break;
            }
        }
        if(isFlag == true)
        {
            System.out.println("很遗憾，没找到");
        }
    }
}
