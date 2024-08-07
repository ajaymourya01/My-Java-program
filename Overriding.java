import java.io.*;
class Greeting
{
void display()
{
System.out.println("Hey!, How are you?");
}
}
class Hello extends Greeting
{
void display()
{
System.out.println("Yeah!, I am fine");
}
}
class Overriding
{
public static void main(String args[])
{
Hello obj=new Hello();
obj.display(); 
}
}