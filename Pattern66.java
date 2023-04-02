class Pattern66{
public static void main(String args[]){
int l = 6;
for(int i=0;i<7;i++){
for(int j=0;j<7;j++){
if(j>=l){
System.out.print("*"+" ");}
else{
System.out.print(" ");}
}
System.out.println("");
l=l-1;
}
int m=6;
for(int i=0;i<=7;i++){
for(int j=7;j>0;j--){
if(j<=m){
System.out.print("*"+" ");
}
else {
System.out.print(" ");
}
}
System.out.println("");
m=m-1;}}}