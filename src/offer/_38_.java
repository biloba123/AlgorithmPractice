package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/8
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _38_ {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array==null || array.length<2) {
            return;
        }

        int xor=0;
        for (int i : array) {
            xor^=i;
        }

        int first1Bit=getfirst1Bit(xor);
        if(first1Bit==-1){
            return;
        }

        num1[0]=num2[0]=0;
        for (int i : array) {
            if (getBitByIndex(i, first1Bit)==1) {
                num2[0]^=i;
            }else {
                num1[0]^=i;
            }
        }
    }

    private int getBitByIndex(int n, int index) {
        return (n>>>index)&1;
    }

    private int getfirst1Bit(int xor) {
        for(int i=0; i<32; i++){
            if((xor&1)==1){
                return i;
            }
            xor>>>=1;
        }
        return -1;
    }
}
