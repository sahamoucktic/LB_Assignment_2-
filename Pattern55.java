import java.util.Scanner;
class Pattern55{
public static void main(String [] args){
System.out.println("Enter number of lines");
Scanner sc= new Scanner(System.in);
int k= sc.nextInt();

for(int i=1;i<=k;i++)
{
for(int j=k-i;j>=1;j--)
{ System.out.print(" ");
}
for(int h=1;h<=(2*i-1);h++)
{
System.out.print("*");
}
System.out.println();
}}}