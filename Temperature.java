//program to convert degree in farenhight

import java.util.Scanner;


class Temperature{

     public void convert(int f){

         int j=((f*(9/5))+32);
         System.out.println("\nTemperature in farenhight is  "+j+" ");
           }
       

    public static void main(String args[])
{

int i;
String text="";
   Scanner s=new Scanner(System.in);
   Temperature t=new Temperature();
do{
         System.out.print("Enter temperature in Degree  ");
         
        i=s.nextInt();
        t.convert(i);
        System.out.print("Do you want to continue?y/n  ");
         text=s.next(); 
         }while(text.equalsIgnoreCase("y"));
      } 
}  