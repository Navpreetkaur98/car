import java.util.Scanner;
class example
{
public static void main(String[] args)
{

 Scanner in=new Scanner(System.in);
int num,i;
num=in.nextInt();
boolean flag=false;
for(i=2;i<=num/2;i++)
{
if(num%i==0)
{
flag=true;
}
}
if(flag==true)
{
System.out.println("Non Prime number");
}
else if(flag==false)
{
System.out.println("Prime number");
}
}
}