import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2;
        int numSum, numProduct, numAverage;

        Scanner input = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = input.nextInt();

        System.out.print("Second number? : ");
        num2 = input.nextInt();

        numSum = num1 + num2;

        numProduct = num1 * num2;

        numAverage = numSum/2;

        if (numSum > 200 && numSum < 1000){
            System.out.println("The sum is = " + numSum + "*~");
            System.out.println();
        }
        else if (numSum >= 1000){
            System.out.println("The sum is = " + numSum + "*");
            System.out.println();
        }
        else {
            System.out.println("The sum is = " + numSum);
            System.out.println();
        }

        System.out.println("The product is = " + numProduct);
        System.out.println();
        System.out.println("The average is = " + numAverage);



    }
}
