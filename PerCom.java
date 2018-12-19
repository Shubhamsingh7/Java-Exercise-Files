//program for calculating P(n,r) and C(n,r)

         import java.util.Scanner; 
class Program{


        //Method to calculate P(n,r)
              void permu(int i,int j){                                             
                                    int a=0;
                                    int b=0;
                                    double c=0;
                                    if(i<j)System.out.println("Maths Error");
                                   else{
                                    a=fact(i);
                                    b=fact(i-j);
   
                                    c=(a/b);

                                  System.out.println("value of P("+i+","+j+")is="+c);
                                        }
                           }


  //Method to calculate C(n,r)
           void combi(int i,int j){
                                   int a=0;
                                   int b=0;
                                   int d=0;
                                   double c=0;
                                   if(i<j)System.out.println("Maths Error");
                                   else{
                                   a=fact(i);
                                   b=fact(i-j);
                                   d=fact(j);

                                   c=(a/(b*d));

                                  System.out.println("value of C("+i+","+j+")is="+c);
                                        } 
                          }

    //Method to calculate factorial
         int fact(int k){
                                  int pro=1;
                                  for(int i=1;i<=k;i++){
                                  pro=pro*i;
                                       }
                                  return pro;
                               }

                      }

class PerCom{


          public static void main(String args []){

                 Scanner s=new Scanner(System.in);
	Program p=new Program();	                                       //making object of class type Program
		int i=0;
		int j=0;
		String text="";
		do{
                                                   
                                                    
                                                
			System.out.println("Menus Are:-");
			System.out.println("press 1 for P(n,r)");
			System.out.println("press 2 for C(n,r)");
                                                     System.out.print("Enter your choice:");
                                                     int choice=s.nextInt();



                                                     switch(choice){

                                                     case 1:

                                                      System.out.print("Enter value of n:");
                                               i=s.nextInt();
                                                      System.out.print("Enter value of r:");
                                               j=s.nextInt();

                                                 
                                                       p.permu(i,j);
                                                       break;
                                             
                                                    case 2:                                              
		
                                                      System.out.print("Enter value of n:");
                                               i=s.nextInt();
                                                      System.out.print("Enter value of r:");
                                               j=s.nextInt();

                                                 
                                                    p.combi(i,j);
                                                    break;

                                          default:
                                          System.out.println("Invalid input");
                                          break;

                               }
                   System.out.print("Do you want to continue?y/n:");
                   text=s.next();
                   }while(text.equalsIgnoreCase("y"));


               }

        }
           






