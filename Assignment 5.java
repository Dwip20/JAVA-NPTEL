/*Write a program which will print a pattern of "*" 's of height "n".
For example:
Input:
               n = 3
Output:
               ***
               **
               *
               **
               ***

NOTE:
Print the pattern EXACTLY, without extra spaces.

(Ignore presentation errors for this and all future programming assignments)
("passed with presentation error" means you will get full marks)*/
import java.util.*;
public class W01_P5{
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
// Add the necessary code in the below space
for(int i = n; i>=1;i--){
  for(int j = 1; j<= i;j++){
    System.out.print("*");
  }
  System.out.println();
}
for(int i = n-1;i>=1;i--){
  for(int j = 1; j<= n-i+1;j++){
    System.out.print("*");
  }
  if(i !=1)
    System.out.println();
}
inr.close();
    }
}
