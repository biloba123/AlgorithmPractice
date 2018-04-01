package neteasy_final;

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
public class Main_1 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int count;
        int[] clocks;
        int h, m;
        int x, a, b, getUpTime, min, last=0;
        while (cin.hasNextInt()){
            count=cin.nextInt();
            clocks=new int[count];
            for (int i = 0; i < count; i++) {
                h=cin.nextInt();
                m=cin.nextInt();
                clocks[i]=h*60+m;
            }
            x=cin.nextInt();
            a=cin.nextInt();
            b=cin.nextInt();

            getUpTime=a*60+b-x;
            min=24*60;
            int temp;
            for (int i = 0; i < count; i++) {
                temp=getUpTime-clocks[i];
                if (temp>=0) {
                    if(temp<min){
                        min=temp;
                        last=clocks[i];
                    }
                }
            }

            System.out.println(last/60+" "+last%60);
        }

    }
}
