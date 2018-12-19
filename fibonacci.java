import System.util.Scanner;
class fibonacci{

public static void main(String a[]){
Scanner s=new Scanner (System.in);

System.out.print("Enter number:);
int num=s.nextInt();
sum=0;
System.out.print("fibonacci series of"+num+"is  ");
for(i=1;i<=num;i++){
sum=sum+i;
System.out.print(sum+"  ");
}
}
}

