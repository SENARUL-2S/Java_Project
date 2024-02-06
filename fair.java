package sss;
import java.util.*;
public class fair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       
        
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            int c=0,t=0;
            for (int j = 0; j < b; j++) {
               int a=in.nextInt();
                if(a%2==1)
                    c++;
                else
                    t++;
                
            }
            if(c%2==1)
               System.out.println("NO");
            else if((t%2==1 && c>=2) || t%2==0)
                 System.out.println("YES"); 
            else
                System.out.println("NO");
              
            
        }
   
   }
}