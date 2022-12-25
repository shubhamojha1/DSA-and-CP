import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--!=0){
           int f = sc.nextInt();
           int sum = 0;
           while(f--!=0){
               int x = sc.nextInt();//size in sq-m
               int y = sc.nextInt();//no. of animals
               int z = sc.nextInt();//env-friendliness
               sum+=(x*z);
           }
           System.out.println(sum);
        }
    }
}
