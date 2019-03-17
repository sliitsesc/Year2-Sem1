package exercise3;

import java.util.Scanner;

/**
 * @author chamodshehanka on 3/17/2019
 * @project LabSheet 5
 **/
// Lab Sheet on Try Catch Blocks

class Main {
    public static void main(String[] args) {

        int maxSubjects;
        int [] marks = new int[5];
        int total = 0;
        double avg;

        try {
            // 1. Input a value for maxSubjects
            //    from keyboard
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input max subject value : ");
            maxSubjects = scanner.nextInt();

            // 2. Using a for loop
            //    input marks
            for (int i = 0; i < maxSubjects; i++) {
                System.out.print("Input subject marks : ");
                marks[i] = scanner.nextInt();
                total += marks[i];
            }

            // 3. Calculate the avg marks
            avg = total/(float)maxSubjects;

            // 4. Use a try catch block to
            //    prevent the following
            //    run time errors
            System.out.println("Total : " + total);
            System.out.println("Avg : " + avg);

            //   (a) Input valid integers to the
            //         inputs
            //   (b) ArithmeticException division
            //        by zero
            //   (c) ArrayIndexOutOfBounds
            //         Exception

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("This code will be gurrentied to run");
        }

        System.out.println("The end");

    }
}
