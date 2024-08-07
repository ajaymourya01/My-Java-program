class Multi extends Thread
{
void run()
{
System.out.println("This is Thread Class");
}
}
class Threadex
{
public static void main(String args[])
{
Thread obj=new Thread();
obj.start();
}
}