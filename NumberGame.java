import java.util.*;
import java.util.Random;
class NumberGameMain
 {
   public static void main(String args[])
   { 
       
    int random=0;
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tThis game is made by Mohak");
    System.out.println("*If you enter 2222 and if 2 is there in answer then it will show 4 right numbers");
    System.out.println("\n\nIf you want to know the answer then type '0'");
    Random r = new Random();
    int digit[]= new int[10];
    int temp3= random;
    digit[5]=0;digit[6]=0;digit[7]=0;digit[8]=0;

digit[5] = r.nextInt(9);
while(digit[5]==0)
{
    digit[5] = r.nextInt(9);
}
digit[6] = r.nextInt(9);
digit[7] = r.nextInt(9);
digit[8] = r.nextInt(9);
while(digit[5]==digit[6]||digit[5]==digit[7]||digit[5]==digit[8]||digit[6]==digit[7]||digit[6]==digit[8]||digit[7]==digit[8])
{
    if(digit[5]==digit[6]||digit[6]==digit[7]||digit[6]==digit[8])
    {
        digit[6] = r.nextInt(9);
    }
    if(digit[5]==digit[7]||digit[6]==digit[7]||digit[7]==digit[8])
    {
        digit[7] = r.nextInt(9);
    }
    if(digit[5]==digit[8]||digit[6]==digit[8]||digit[7]==digit[8])
    {
        digit[8] = r.nextInt(9);
    }
}   
String ran=digit[5]+""+digit[6]+""+digit[7]+""+digit[8];
random=Integer.parseInt(ran);
    Scanner sc = new Scanner(System.in);
    for(int k=1;k<=101;k++)
    {
    System.out.print("Enter a 4 digit number: ");
    int a=sc.nextInt();
    if(a==0)
    {
      System.out.println("The random number: "+random);
      System.out.println("Thank you for trying out my program");
      System.exit(0);
    }
    int temp=a;
    int count=0;
    
    int temp1=a;
    digit[1]=0;digit[2]=0;digit[3]=0;digit[4]=0;
    
      digit[1]=temp1/1000;
      int d2= temp1/10;
      int d4= d2/10;
      digit[2]= d4%10;
      int d3= temp1%100;
      digit[3]=d3/10;
      digit[4]=d3%10;
      int count1=0;
      int[] numArray1 = {digit[1],digit[2],digit[3],digit[4]};
  int[] numArray2 = {digit[5],digit[6],digit[7],digit[8]};
  
  for(int i = 0; i < numArray1.length; i++)
  {
   for(int j = 0; j < numArray2.length; j++)
   {
    if(numArray1[i] == numArray2[j]){
     count1++;
     break;
    }
   }
}
      
      System.out.println("Right digits: "+count1);
      int count2=0,count3=0,count4=0,count5=0;
      if(digit[5]==digit[1])
      {
        count2++;
      }
      if(digit[6]==digit[2])
      {
        count2++;
      }
      if(digit[7]==digit[3])
      {
        count2++;
      }
      if(digit[8]==digit[4])
      {
        count2++;
      }
      
      System.out.println("Right position: "+count2);
      System.out.println("Number of attempts: "+k);
      System.out.println("");
      if(a==random)
      {
        System.out.println("You're correct!!");
        System.exit(0);
      }
    }
    }
    
 }
