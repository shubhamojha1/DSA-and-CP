/*
        https://codeforces.com/contest/1728/problem/B
*/
import java.util.*;
public class Solution{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while(t--!=0){
            int n = sc.nextInt();
            if(n%2==0){
                for(int i=n-2;i>=1;i--)
                System.out.print(i+" ");
                System.out.println(n-1+" "+n);
            }else{//atleast greater than 5
                    System.out.print(1+" "+2+" "+3+" ");
                    for(int i=n-2;i>=4;i--)
                        System.out.print(i+" ");
                        System.out.println(n-1+" "+n);

            }

        }
        sc.close();
    }
}
