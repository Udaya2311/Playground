import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int[]a=new int[n];
    int[]b=new int[n];
    
    for(int i=0;i<n;i++)
    {
      a[i]=ob.nextInt();
      b[i]=ob.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      a[i]=(a[i]*12)+b[i];
    }
    int temp=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]>a[j])
        {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        }
      }
    }
    System.out.println(a[n-1]);
  }
}