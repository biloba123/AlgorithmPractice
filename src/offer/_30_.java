package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/7
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _30_ {
    public String PrintMinNumber(int [] numbers) {
        if (numbers==null || numbers.length<1) {
            return "";
        }

        sort(numbers);

        StringBuilder sb=new StringBuilder();
        for (int number : numbers) {
            sb.append(number);
        }
        return sb.toString();
    }

    private void sort(int[] numbers) {
        int min, temp;
        for (int i = 0; i < numbers.length-1; i++) {
            min=i;
            for(int j=i+1; j<numbers.length; j++){
                if(compare(numbers[min], numbers[j])){
                    min=j;
                }
            }
            if(min!=i){
                temp=numbers[i];
                numbers[i]=numbers[min];
                numbers[min]=temp;
            }
        }
    }

    private boolean compare(int num1, int num2) {
        String s1=num1+""+num2,
                s2=num2+""+num1;
        return s1.compareTo(s2)>0;
    }

}
