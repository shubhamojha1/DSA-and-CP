import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--!=0){
            String s = sc.next();
            if(s.equals("1")||s.equals("4")||s.equals("78"))
            System.out.println("+");
            else if(s.endsWith("35"))
            System.out.println("-");
            else if(s.charAt(0)=='9' && s.charAt(s.length()-1)=='4')
            System.out.println("*");
            else if(s.startsWith("190"))
            System.out.println("?");
        }
    }
}
