package neteasy;

import java.util.Scanner;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/15
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int num;
        int len, xCount, _2Count, _4Count;
        int temp;
        num = cin.nextInt();
        for (int i = 0; i < num; i++) {
            xCount=_2Count=_4Count=0;
            len=cin.nextInt();
            for (int i1 = 0; i1 < len; i1++) {
                temp=cin.nextInt();
                if (temp%2!=0) {
                    xCount++;
                }else {
                    if(temp%4==0){
                        _4Count++;
                    }else {
                        _2Count++;
                    }
                }
            }

//            System.out.println(xCount+" "+_2Count+" "+_4Count);

            if (_2Count>0) {
                _2Count=1;
            }

//            System.out.println(xCount+" "+_2Count+" "+_4Count);

            if(_4Count>=xCount+_2Count-1){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }


//        System.out.println(getOrder(8));
    }

    private static String getFragmentLength(String num) {
        if (num==null || num.length()<1) {
            return "0";
        }

        int count=0, total=0;
        int len=0;
        for (int i = 0; i < num.length()-1; i++) {
            if(num.charAt(i)!=num.charAt(i+1)){
                total+=len+1;
                count++;
                len=0;
            }else {
                len++;
            }
        }

        if (len==0) {
            total++;
        }else {
            total+=len+1;
        }
        count++;



        return String.format("%.2f", total*1f/count);
    }

    private static int getOppositeNum(int num) {
        if(num<1){
            return 0;
        }
        int reverseNum=Integer.valueOf(new StringBuilder(num+"").reverse().toString());
        return num+reverseNum;
    }

    private static String getOrder(int coins) {
        if(coins<1){
            return "";
        }

        StringBuilder sb=new StringBuilder();
        for(; coins>0; coins/=2){
            if (coins%2==0) {
                sb.append(2);
                coins-=2;
            }else {
                sb.append(1);
                coins-=1;
            }
        }

        if(coins==0) {
            return sb.reverse().toString();
        }else {
            return "";
        }
    }


}
