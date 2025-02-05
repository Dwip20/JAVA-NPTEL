/*Write a Java program to print the multiplication table of a given number up to 5.
NOTE:
Print EXACTLY as shown in the sample output.
DO NOT MISS a single space otherwise you will not be scored.
(Ignore presentation errors for this and all future programming assignments)
("passed with presentation error" means you will get full marks)*/

import java.util.Scanner;

public class W01_P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
    // Print the multiplication table of number up to 
for(int i = 1; i <= 4; i++){
  System.out.println(number+ "x"+i+"="+(number*i));
}
System.out.print(number+"x"+5+"="+(number*5));
in.close();
    }
}
