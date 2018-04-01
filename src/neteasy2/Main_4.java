package neteasy2;

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
public class Main_4 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int[] array, temp;
        for(int count; cin.hasNextInt(); ){
            count=cin.nextInt();
            array=new int[count];
            for (int i = 0; i < count; i++) {
                array[i]=cin.nextInt();
            }

            temp=new int[count];
            int index=0;
            int i;
            for(i=count-1; i>=0; i-=2){
                temp[index++]=array[i];
            }
            for(int i1=i==-2? 1: 0 ; i1<count; i1+=2){
                temp[index++]=array[i1];
            }

            int l=count-1;
            for (int i1 = 0; i1 < l; i1++) {
                System.out.print(temp[i1]+" ");
            }

            System.out.println(temp[count-1]);
        }

    }


}
