package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/9
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _49_ {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers==null || length<1) {
            return false;
        }

//        int[] counts=new int[length];
//        for (int number : numbers) {
//            if(number<0 || number>=length){
//                return false;
//            }else {
//                counts[number]++;
//                if(counts[number]>1){
//                    duplication[0]=number;
//                    return true;
//                }
//            }
//        }
//
//        return false;

        int num;
        for (int i = 0; i < length; ) {
            num=numbers[i];
            if (num!=i) {
                if(num==numbers[num]){
                    duplication[0]=num;
                    return true;
                }else {
                    numbers[i]=numbers[num];
                    numbers[num]=num;
                }
            }else {
                i++;
            }
        }
        return false;
    }
}
