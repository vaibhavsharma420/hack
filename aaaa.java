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

public class aaaa {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int arr[]) 
    {
        int maxcount=0;
        int val=arr[0];
        for(int x=0;x<arr.length-1;x++)
        {
            int count=1;
            for(int y=x+1;y<=arr.length-1;y++)
            {
                if(arr[y]==arr[x])
                    count++;
                else
                {
                    x=y;
                    break;
                }
            }
            if(count>maxcount)
            {
                maxcount=count;
                val=arr[x];
            }
        }
        return val;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int x=0;x<n;x++)
        {
            arr[x]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(migratoryBirds(arr));
    }
}
