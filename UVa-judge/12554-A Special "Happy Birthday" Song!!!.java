// import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]){
        // PrintStream o = new PrintStream(new File("A.txt"));
  
        // // Store current System.out before assigning a new value
        // PrintStream console = System.out;
  
        // // Assign o to output stream
        // System.setOut(o);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String names[] = new String[n];
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        int i=0;int j=0;int nn = n;
        int numberOfTimes = nn==16 ? 16 :(nn/16 +1)*16;
       // System.out.println(numberOfTimes);
        //System.out.println(nn);
        String song[] = {"Happy", "birthday", "to", "you", "Happy", "birthday", "to", "you","Happy", "birthday", "to", "Rujia", "Happy", "birthday", "to", "you"};
        while(true){
            System.out.println(names[i%n] +": "+song[j%16]);
            i++;
            j++;
            numberOfTimes--;
            // System.out.println(i+" "+j+" "+numberOfTimes);
            if(numberOfTimes==0)
            {break;}
        }
    }
}
