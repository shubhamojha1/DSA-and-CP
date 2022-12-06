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
           int n=sc.nextInt();
           int a[] = new int[n];
           for(int i=0;i<n;i++)
           {
            a[i]=sc.nextInt();
           }
           if(n==1)
            return "Yes";
           Arrays.sort(a);
           for(int i=0;i+1<n;i++){
                if(a[i+1]==a[i])
                    return "No";
           }
            return "Yes";
           
     
        }
    }
