    import java.util.*;
    public class Solution{
        static Scanner sc = new Scanner(System.in);
        public static void main(String args[]){
     
            
            int t = sc.nextInt();
            while(t--!=0){
                System.out.println(solve());
            }
        }
        public static String solve(){
           int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if(a+b==c)
                return "Yes";
            if(b+c==a)
                return "Yes";
            if(c+a==b)
                return "Yes";
            
            return "No";
        }
    }
