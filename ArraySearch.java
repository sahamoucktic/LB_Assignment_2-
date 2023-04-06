class ArraySearch{
public static void main(String [] args){
int arr[][]={{1,3,5},{44,77,66},{49,64,81}};
int target=1;
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
if(target==arr[i][j]){
System.out.print("row number is "+ i+" and column number is "+j);
}
}
}
}
}