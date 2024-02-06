package sss;
import java.util.*;
public class addorsubs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
          int a = in.nextInt();
          int b = in.nextInt();
          int s=0;
          if(a==b){
                System.out.println("0");
                continue;}
          if(b>a){
               int d = b-a;
              s++;
               if(d%2 !=1){
                     s++;}
             }
              else if(a>b){
                  int d = a-b;
                      s++;
                  if(d%2 !=0){
                      s++;}
                   
                }
            System.out.println(s);
        }
    }
}
