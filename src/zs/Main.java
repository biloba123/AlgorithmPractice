package zs;

import java.util.Scanner;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/26
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n;
        while (cin.hasNextInt()){
            n=cin.nextInt();
            System.out.println(maxProduct(n));
        }

    }

    private static int maxProduct(int n) {
        if(n<1){
            return 0;
        }
        if(n==2 || n==3){
            return n-1;
        }
        if(n==4){
            return n;
        }

        int product=1;
        for(; n>4; n-=3){
            product*=3;
        }

        return product*n;
    }
}
