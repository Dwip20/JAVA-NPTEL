/*
Write a Java program to calculate the volume of a cylinder given its radius and height.

Formula:

V=π×r2×h

You can use Math.PI for the computation.

NOTE:

The code you see is not complete.

Your task is to complete the code as per the question.
Think of it like a programming puzzle.

(This question can be solved in just one line of code)

(Ignore presentation errors for this and all future programming assignments)
("passed with presentation error" means you will get full marks) */

import java.util.Scanner;

public class W01_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
// Calculate the volume
double volume = Math.PI * radius * radius * height;
// Display the result
    System.out.printf("Volume is: %.2f", volume);
    in.close();
  }
}
