import java.util.Scanner;
class decrease
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int x=0;x<n;x++)
        {
            System.out.println("Enter number at index "+(x+1));
            arr[x]=sc.nextInt();
        }
        ob.sorting(arr[],0,n-1);
        System.out.println("Sorted Array:");
        for(int x=0;x<=9;x++)
        {
            System.out.println(ar[x]);
        }
    }
}
 public int partition(int arr[], int left, int right)
    {
       int pivot = arr[right];
       int i = left - 1;
       for(int j = right; j >= left; j--)
    {
        if (arr[j] > pivot)
        {
            i = i + 1;                                      
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
    }

    int temp = arr[i+1];
    arr[i+1] = arr[right];
    arr[right] = temp;

    return i + 1;

    }

public void sorting(int arr[], int left, int right)
{
    if(left < right)
    {
        int q = partition(arr, left, right);
        sorting(arr, left, q - 1);
        sorting(arr, q + 1, right);
    }
}
