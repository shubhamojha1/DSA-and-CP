import java.util.*;
//import java.text.*;

public class Solution {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++)
        {
            int cost = 0;
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int x=0;x<n;x++)a[x]=sc.nextInt();

            for(int x=0;x<n-1;++x)
            {
                int j = Min(a,x,a.length);
                //j+=x;
                //System.out.println(x+" "+j);
                cost+= j-x+1;
                Reverse(a,x,j);
                //System.out.println(cost);
            }
            System.out.printf("Case #%d: %d\n",i,cost);
        }
        
    }
    static int Min(int a[], int x, int l){

        int min=a[x],index=x;
        for(int i=x;i<l;i++){
            if(a[i]<min){min=a[i];index=i;}
        }
        return index;
    }
    static void Reverse(int a[], int x1, int x2){
        int i=x1, j=x2;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;    
        }
    }
}
