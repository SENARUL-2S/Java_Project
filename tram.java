package sss;


import java.util.*;

 public class tram {  
    public static void main(String[] args) {
      
     Scanner reader =new Scanner(System.in);  
      int n=reader.nextInt();
    
      for(int i=0; i<n; i++)  
      {      
        int a=reader.nextInt(); 
        int b=reader.nextInt(); 
        int c=reader.nextInt(); 
        int r=c%a;
        if(r>b){
         int d= r-b;   
         System.out.println(c-d);
         }
        else if(r<b){
         int m= b-r;   
         System.out.println(c-(a-m));
         }
        else
              System.out.println(c);
      }
 }
 }