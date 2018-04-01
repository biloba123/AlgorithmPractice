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
class _45_ {
    public int LastRemaining_Solution(int n, int m) {
         if (n<2 || m<1) {
            return 0;
        }

        int childs[]=new int[n];
         int count=0;
         int which=0;
         for(int i=0; count<n-1; ){
             if (childs[i]==0) {
                 which++;
                 if(which==m){
                     System.out.println(i);
                     which=0;
                     childs[i]=1;
                 }
             }
             i++;
             if (i==n) {
                 i=0;
             }
         }

        for (int i = 0; i < childs.length; i++) {
            if(childs[i]==0){
                return i;
            }
        }
        return 0;
    }
}
