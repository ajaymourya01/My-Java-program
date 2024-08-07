import java.io.*;
class Calculation
{
int a=4, b=5, add, sub, div, multi;
void cal()
{
add=a+b;
System.out.println(add);
}
void cal()
{
sub=a-b;
System.out.println(sub);
}
void cal()
{
div=a/b;
System.out.println(add);
}
void cal()
{
multi=a*b;
System.out.println(add);
}
}
class Result
{
public static void main(String args[])
{
Calculation obj=new Calculation();
obj.cal();
obj.cal();
obj.cal();
obj.cal();
}
}