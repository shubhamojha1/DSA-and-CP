import java.util.*;
public class Solution{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
while(t--!=0){
    int n = sc.nextInt();
    int max = 0, pos=-1;
    for(int i=0;i<n;i++){
        int cnt = sc.nextInt();
        if(cnt>max)
        {
            max=cnt;
            pos=i+1;
        }
    }
    System.out.println(pos);
}
sc.close();
}
}
