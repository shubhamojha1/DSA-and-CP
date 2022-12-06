    import java.util.*;
    public class submit {
        static Scanner sc = new Scanner(System.in);
        public static void main(String args[]){
     
            int t = sc.nextInt();
            while(t--!=0){
                solve();
            }
        }
     
        public static void solve(){
            int n = sc.nextInt();
                if(n==3)
                    System.out.println(-1);
                else{
                    if(n==2)
                        System.out.println(2+" "+1);
                    else{
                        System.out.print(n-1+" "+n+" ");
                        for(int i=1;i<=n-2;i++){
                            System.out.print(i+" ");
                        }
                        System.out.println();
                    }
                    
                }
            
        }
    }
