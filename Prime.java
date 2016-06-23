import java.util.*;
 public class A
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a no");
int p=s.nextInt();
try
{
if(p<=0 || p==1 || p==3)
{
System.out.println("not prime");
}
else if(p==2)
{
System.out.println("  prime no");
}
while(p>3)
{
int b=(p*p-1)%24;
if(b==0)
System.out.println("  prime no");
else
System.out.println("  not prime no");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
