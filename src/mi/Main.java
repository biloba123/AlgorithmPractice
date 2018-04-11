package mi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            List<String> list=new ArrayList<>();
            sol(in.next(), 0, "", list);
            if(list.size()>0) {
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println(list.get(list.size()-1));
            }
        }
    }

    private static void sol(String s, int start, String cur, List<String> list) {
        if (s.length()<1) {
            return;
        }

        if (start>=s.length()) {
            list.add(cur);
            return;
        }

        if(s.charAt(start)=='0'){
            return;
        }

        int n;
        for(int i=1; i<3 && start+i<=s.length(); i++){
            n=Integer.valueOf(s.substring(start, start+i));
            if(n>0 && n<27){
                sol(s, start+i, cur+((char)('a'+n-1)), list);
            }
        }

    }

}

