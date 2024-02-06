package sss;
import java.util.*;
public class gravity {
    
 public static void main(String[] args) {
      
     Scanner reader =new Scanner(System.in);  
      int n=reader.nextInt();
      int[] b = new int[n];
      int[] a = new int[n];
      for(int i=0; i<n; i++)  
      {    
        a[i]=reader.nextInt();
        b[i]=a[i];
      }
    Arrays.sort(b);
    for (int i=0; i< n; i++)   
      
      
        System.out.println(b[i]);
        }
}