import java.util.Scanner;
class example
{
public static void main(String[] args)
{

 Scanner in=new Scanner(System.in);
 int x,y,z,rev=0;
 x=in.nextInt();
 int temp;
 temp=x;
while(temp!=0)
{
int rem=temp%10;
rev=(rev*10)+rem;
temp=temp/10;
}
if(rev==x)
{
System.out.println("Palindrone");
}
else
{
System.out.println("Non Palindrone");
}
}
}