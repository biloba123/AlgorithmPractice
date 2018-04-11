package mi;

import java.util.Scanner;

public class Main_1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static long solution(int n) {
        long a=1, b=2;
        for(int i=2; i<n; i+=2){
            a+=b;
            b+=a;
        }

        return n%2==0? b: a;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;

        int _n;
        while (in.hasNextInt()) {
            _n = Integer.parseInt(in.nextLine().trim());

            res = solution(_n);
            System.out.println(String.valueOf(res));
        }

    }
}

