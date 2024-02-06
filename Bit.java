package sss;
import java.util.*;
public class Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x=0;
         String m ="X++";
         String k ="++X";
         String [] s = new String[n];
        for (int i = 0; i < n; i++) {
             String a = in.next();
             s[i]=a;
        }
             for (int i = 0; i < n; i++) {
            if(s[i].equals(m) || s[i].equals(k)){
                 x++;}
             else {
                   x--;  }
             }
             System.out.println(x);
             
        }
    }

