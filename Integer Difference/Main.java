import java.util.*;
class Main
{
  static void ans(int arr[],int l,int n, int m)
  {
    for(int i=0;i<l;i++)
    {
      if(arr[i]-n < m)
      {
        arr[i]+=1;
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int arr[] = new int[l];
    for(int i=0;i<l;i++)
    {
      arr[i] = sc.nextInt();
    }
    int n = sc.nextInt();
    int m = sc.nextInt();
    ans(arr,l,n,m);
    for(int i=0;i<l;i++)
    {
      System.out.print(arr[i]+" ");
    }
    
  }
}