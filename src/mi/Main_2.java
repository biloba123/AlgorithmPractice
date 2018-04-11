package mi;

import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] pots=new int[3];
        while (in.hasNext()){
            sol(in.next(), 0, 0, pots);
        }
    }

    private static void sol(String s, int start, int cur, int[] pots) {
        if (s.charAt(0) == '0') {
            return;
        }

        int left=s.length()-start;
        if(left>3*(4-cur) || left<4-cur){
            return;
        }

        if(cur==3){
            int n=Integer.valueOf(s.substring(pots[2]));
            if(n>0 && n<=255) {
                System.out.println(s.substring(0, pots[0]) + "."
                        + s.substring(pots[0], pots[1]) + "."
                        + s.substring(pots[1], pots[2]) + "."
                        + s.substring(pots[2]));
            }
            return;
        }

        String sub;
        int n;
        for(int i=1; i<4 && start+i<=s.length(); i++){
            if(i>1){
                sub=s.substring(start, start+i);
                n=Integer.valueOf(sub);
                if (sub.charAt(0) != '0' && 0<n && n<=255) {
                    pots[cur]=start+i;
                    sol(s, start+i, cur+1, pots);
                }
            }else{
                pots[cur]=start+1;
                sol(s, start+1, cur+1, pots);
            }
        }
    }
}

