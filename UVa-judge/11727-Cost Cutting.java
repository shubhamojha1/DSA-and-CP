import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        int testcases = 0;
        while(testcases++!=t){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int ans = x+y+z;
            int max = Math.max(x,(Math.max(y, z)));
            int min = Math.min(x,(Math.min(y, z)));
            ans-=(max+min);
            System.out.println("Case "+testcases+": "+ans);
        }
    }
}
