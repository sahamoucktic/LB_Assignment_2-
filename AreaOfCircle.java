import java.util.Scanner;
class AreaOfCircle{
public static void main(String [] args){
System.out.println("Enter the raidus of the circle?");
Scanner sc = new Scanner(System.in);
double k =  sc.nextDouble();
double ar = (double)3.14*k*k;
System.out.println("Area of the circle is  "+ar);
}}