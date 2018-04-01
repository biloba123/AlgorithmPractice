package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/5
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _09_PrintOneToNthDigits {
    public static void printOneToNthDigits(int n){
        if(n<1){
            throw new RuntimeException("Invalid");
        }

        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=0;
        }

        while (addOne(num)) {
            printNum(num);
        }
    }

    private static void printNum(int[] num) {
        int i=0;
        for(; num[i]==0; i++);
        for(; i<num.length; i++){
            System.out.print(num[i]);
        }
        System.out.println();
    }

    public static boolean addOne(int[] num){
        int carry=0;
        for(int i=num.length-1; i>=0; i--){
            num[i]+=1;
            if (num[i]==10){
                num[i]=0;
                carry=1;
            }else {
                carry=0;
                break;
            }
        }

        return carry==0;
    }
}
