\\program to convert degree in farenhight

import java.util.Scanner;


class Temperature{

     public void convert(int i){

         int j=((i*9/5)+32);
         System.out.println("Temperature in farenhight is"+j+" ");
           }
       

    publis static void main(String args[])
{

int i;
   Scanner s=new Scanner(System.in);
   Temperature t=new Temperature();
         System.out.println("Enter temperature in Degree");
         
        i=s.nextint();
      }   