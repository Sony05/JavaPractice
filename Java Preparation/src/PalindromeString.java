import java.io.*;
import java.util.*;

public class PalindromeString {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String");
        String A=sc.next();
        sc.close();
     
        int n = A.length();
        try
        {
        for(int i=0; i<= n/2; i++)
            for(int j=n-1; j> n/2; j++)
            
            	if(A.charAt(i) == A.charAt(j))
      
            System.out.println("Yes");

            else
            System.out.println("No");
        }
    
        catch(Exception E)
        {
  
        	
        }
        }
       
    }

