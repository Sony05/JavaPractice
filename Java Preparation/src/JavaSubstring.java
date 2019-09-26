//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class JavaSubstring {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        try{
        for (int i = start; i<end; i++)
        {
            System.out.println(S.charAt(i));
        }
        }
        catch(Exception E)
        {

        }

    }
}
