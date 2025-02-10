/*Write a Java program to check if a given integer is even or odd.
NOTE:

The code you see is not complete.

Your task is to complete the code as per the question.
Think of it like a programming puzzle.

(Ignore presentation errors for this and all future programming assignments)
("passed with presentation error" means you will get full marks)*/



import java.util.Scanner;

public class W01_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
// Check if the number is even or odd
if (number%2==0){
  System.out.print("Even");
}
else{
  System.out.print("Odd");
}   
in.close();
    }
}
