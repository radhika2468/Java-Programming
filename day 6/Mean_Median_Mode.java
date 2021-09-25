import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int mode =0;
        int n =scan.nextInt();
        int maxdisc=0;
        double sum=0;
         int count =0;
        double median=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=scan.nextInt();
            sum =sum+ x[i];    
        }
        for(int k=0; k<n;k++)
        {
            for(int l=0;l<n-1;l++)
            {
                if(x[l]>x[l+1]){
                    int t=x[l];
                    x[l]=x[l+1];
                    x[l+1]=t;
                }
            }
        }
        double mean=sum/n;
        
        if (n%2==0){
            median = ((x[n/2])+(x[(n/2)-1]))/2.0;
        }
        else{
            median =x[n/2];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if (x[i]==x[j])
                {
                    count ++;
                    if(count>maxdisc)
                    {
                        maxdisc=count;
                        mode = x[i];
                    }
                }
            }
            count =0;
        }
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }
}
