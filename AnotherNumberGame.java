import java.util.*;
 class NumberGame2
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.println("\t\tThis program is made by Mohak");
    System.out.println("You will get 5 chances");
       System.out.println("Your last number will not be considered");
       System.out.println("Input any 1 number\n");
    double a=Math.random();
    double b = 100*a;
       int num =(int)b;
    for(int i=1;i<7;i++)
    {
      int c = sc.nextInt();
      if(i==6)
      {
        System.out.println("Sorry your chances are over");
        System.out.println("The number was: "+num);
        break;
      }
      if(c<num)
      {
        System.out.println("Enter a number above "+c);
        
      }
      if(c>num)
      {
        System.out.println("Enter a number below "+c);
        
      }
      if(c==num)
      {
        System.out.println("You have guessed it correctly!");
        break;
      }
    }
   }
 }
