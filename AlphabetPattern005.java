class AlphabetPattern005{

public static void main(String args[]){

int alpha=65;
for(int i=0;i<=5;i++)
{ for(int j=0;j<=i;j++) //space
{System.out.print((char)(alpha+i));
}
System.out.println();
}}}