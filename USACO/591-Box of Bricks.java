// import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]){
        // PrintStream o = new PrintStream(new File("A.txt"));
  
        // // Store current System.out before assigning a new value
        // PrintStream console = System.out;
  
        // // Assign o to output stream
        // System.setOut(o);
       Scanner sc = new Scanner(System.in);
    //    ArrayList<Integer> arr = new ArrayList<Integer>();
       int set = 1;
       while(true){
           int n = sc.nextInt();
           if(n==0)break;
           int sum=0;
           int arr[] = new int[n];
           for(int i=0;i<n;i++){
               int input = sc.nextInt();
               
                   arr[i]=input;
                   sum+=input;
               
           }
           
           int avg = sum/n;
           int ans = 0;
               for(int i=0;i<n;i++){
                ans+=(Math.abs(arr[i]-avg));
            }
            System.out.println("Set #"+set++);
            System.out.println("The minimum number of moves is "+ans/2+".");
       }
    }
}
