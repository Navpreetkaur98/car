import java.util.Scanner;
class example
{
public static void main(String[] args)
{

 Scanner in=new Scanner(System.in);
 int x,y,z;
 x=in.nextInt();
 y=in.nextInt();
 z=in.nextInt();
 if(x>y && x>z)
{
System.out.println(x);
}
else if(y>x && y>z)
{
System.out.println(y);
}
else
{
System.out.println(z);
}
}
}