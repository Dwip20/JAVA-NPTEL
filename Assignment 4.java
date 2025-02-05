/*Complete the code fragment that reads two integer inputs from keyboard and compute the quotient and remainder.

(Ignore presentation errors for this and all future programming assignments)
("passed with presentation error" means you will get full marks)*/

import java.util.Scanner;
public class W01_P4{
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
//code for quotient and remainder
if (y==0){
  System.out.println("Error: Division by zero is not allowed");
}
else{
  int quotient = x/y;
  int remainder = x%y;
  System.out.println("The quotient is = "+quotient);
  System.out.print("The remainder is = " + remainder);
}
 sc.close();
  }
}
