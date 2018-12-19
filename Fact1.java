import java.util.Scanner;

    public  class Fact1{

           static void fact(int i)
 

   {
                        int j=1;
                        int   pro=1;
                        for(j=1;j<=i;j++)
                        pro*=j;
                        System.out.println("factorial is"+pro);


   }
                        public static void main(String args[])
 

 {
                        Scanner s=new Scanner(System.in);
                        Fact1 f=new Fact1();
                        int i=0;
                        String t=" ";                                                     //declaring string and initialize      
                       
                        do{

                        System.out.print("Enter number:");
                        i=s.nextInt();                                                   //for giving input by key board on run time
                        f.fact(i);                                                           //for calling method fact
                        System.out.print("Do you want to continue ");
                        t=s.next();
                      
                        }while(t.equalsIgnoreCase("y"));

  }

 

 }

                  