import java.util.Scanner;

class AddNumbers
{
public static void main(String args[])
{
    int x,y,z;
    System.out.println("Enter Two integers");
    Scanner in = new
Scanner(System.in);
    x= in.nextInt();
    y=in.nextInt();
    z=x+y;
    System.out.println("Sum of enter Integers are "+z);
}
}