//Program to find is given number is factorial of any number

import java.util.Scanner; 

             class ReverseFactorial{
                       public static void main(String args[]){
                                   int num;
                                   int z;
                                  String k="";
do{
                                  Scanner s=new Scanner(System.in);
                                  System.out.print("Enter number:");
                                  num=s.nextInt();
                                  z=num;
                                  int rem,i=1,q;

                       do{
                                  q=num/i;
                                  rem=num%i;
                            
                                  num=q;
                                  if(q==1)
                                  break;
                                  i++;
                      }while(rem==0);

                            if(rem==0)
                                  System.out.println(z+" is  factorial of "+i);
                           else
                                  System.out.println(z+" is not factorial of any number");
                          
                                  System.out.print("Do you want to continue?y/n:");
                                  k=s.next();
                           } while(k.equalsIgnoreCase("y"));


               }
    }