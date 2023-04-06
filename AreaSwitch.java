import java.util.Scanner;


class AreaSwitch{

void rect(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the width");
int w = sc.nextInt();
System.out.println("Enter the breadth");
int b= sc.nextInt();
int A=w*b;
System.out.println("Rectangle area is "+ A);
}

void square(){
Scanner re= new Scanner(System.in);
System.out.println("Enter the side of the square");
int side=re.nextInt();
int A= side*side;
System.out.println("Square area is "+A);
}

void circle(){
Scanner ci=new Scanner(System.in);
System.out.println("Enter the radius");
int rad=ci.nextInt();
float A=(float)3.14*rad*rad;
System.out.println("circle Area is "+A);
}

public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("1.Rectangle 2.Square 3.Circle");
System.out.println("Enter the choice");
int i=sc.nextInt();

switch(i){
case 1:AreaSwitch r1=new AreaSwitch();
r1.rect();
break;
case 2: AreaSwitch r2=new AreaSwitch();
r2.square();
break;
case 3: AreaSwitch r3=new AreaSwitch();
r3.circle();
break;
}
}
}