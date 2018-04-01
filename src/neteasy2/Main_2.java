package neteasy2;

import java.util.Arrays;
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
public class Main_2 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int[] array;
        for(int count; cin.hasNextInt(); ){
            count=cin.nextInt();
            array=new int[count];
            for (int i = 0; i < count; i++) {
                array[i]=cin.nextInt();
            }

            if(isArithmeticProgression(array)){
                System.out.println("Possible");
            }else {
                System.out.println("Impossible");
            }


        }

    }

    private static boolean isArithmeticProgression(int[] array) {
        if(array.length<3){
            return true;
        }
        Arrays.sort(array);
        int d=array[1]-array[0];
        for (int i = 2; i < array.length; i++) {
            if(array[i]-array[i-1]!=d){
                return false;
            }
        }

        return true;
    }

}
