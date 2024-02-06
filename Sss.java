package sss;

import java.util.*;

 public class Sss {   
    public static void main(String[] args) {
      
     Scanner reader =new Scanner(System.in);  
      int n=reader.nextInt();
      int k=reader.nextInt();
      int s=0;
     int[] a = new int[n];
      for(int i=0; i<n; i++)  
      {    
        a[i]=reader.nextInt();
        if(a[i]>=a[k-1] && a[i]>0 ){
            s++;
         }
       }
        System.out.println(s);
    
    }
 }