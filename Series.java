    import java.util.Scanner;
         class Series{
                   public int fact(int k){
                            int pro=1;
                            for(  int i=1;i<=k;i++)
                            pro=pro*i;
                            return pro;
                           
                            }

                  public static void main(String args[]){
                                  int   i,num,den,n;
                                  double fra;
                                  double sum=0;
                                  Scanner s=new Scanner(System.in);
                                  Series m=new Series();
                                  String text="";
            do{
                                  System.out.print("Enter number of term:  ");
                                  n=s.nextInt();
                                  for(i=1;i<=n;i++)
                                       {
                                            num=i*i;
                                            den=m.fact(i);                       //method calling
                                            fra=(num/den);
                                            sum= sum+fra;
                                      }
                                  System.out.println("Sum of Series is:"+sum);
                                  System.out.print("\nDo you want to continue?y/n  ");
                                               text=s.next();
                                               }while(text.equalsIgnoreCase("y"));
                     }
      } 
 