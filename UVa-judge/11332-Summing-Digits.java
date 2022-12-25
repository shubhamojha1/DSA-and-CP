// import java.io.FileNotFoundException;
// import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // PrintStream o = new PrintStream(new File("A.txt"));
  
        // // Store current System.out before assigning a new value
        // PrintStream console = System.out;
        // // Assign o to output stream
        // System.setOut(o);
        // int t =sc.nextInt();
        while(true){
            long x = sc.nextLong();
            if(x==0)
            break;
           System.out.println(sumOfDigits(sumOfDigits(sumOfDigits(x))));
        }
    }

    public static long sumOfDigits(long n){
        if(n==0)
        return 0;

        return (n%10 + (sumOfDigits(n/10)));
    }
}
