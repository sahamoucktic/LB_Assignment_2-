import java.util.Scanner;

class Array{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of array ");

int i= sc.nextInt();

int arr[] = new int[i];

for(int j=0;j<i;j++){
System.out.println("Enter the array elements");
arr[j]= sc.nextInt();
}
for(int k=0;k<i;k++){

System.out.print(arr[k]);
System.out.print("\t");
}
//max
int max=0;
for(int m=0;m<i;m++){
	if(arr[m]>max)
	{		max=arr[m];}
	
}
System.out.println("maximum is "+max );

int min=max;
for(int n=0;n<i;n++){
	if(arr[n]<min){
min=arr[n];}}
	System.out.println("minimum is "+ min);


}}

