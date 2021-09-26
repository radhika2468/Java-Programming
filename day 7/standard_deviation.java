import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Solution {
    public static void main(String[] args)  {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int a[]=new int[n]; 
       double sum=0;
       double sumo=0;
       for(int i=0;i<n;i++)
       {
           a[i]=scan.nextInt();
           sum=sum+a[i];
       }
       double mean=sum/n;
       for(int i=0;i<n;i++)
       {
           sumo=sumo+(a[i]-mean)*(a[i]-mean);
       }
       double l=sumo/n;
       double f=Math.sqrt(l);
       System.out.print(String.format("%.1f",f));
    }
}