import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    int m=ob.nextInt();
    int rs=ob.nextInt();
    int x=0,y=0;
    if(a>m)
    {
      x=a-m;
      y=rs-x;
    }
    else
    {
      x=m-a;
      y=rs+x;
    }
    System.out.println(y);
  }
}