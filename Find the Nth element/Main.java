import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> li = new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
      li.add(sc.nextInt());
    }
    int pos = sc.nextInt();
    if(pos<=n)
    System.out.println(li.get(pos-1));
    else
    System.out.println("No node found");
  }
}