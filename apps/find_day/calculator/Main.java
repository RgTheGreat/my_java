import java.io.BufferedReader;
import java.lang.ArithmeticException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        String operator, get_continue;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Calculator");
        while (true) {
        try {

            System.out.println("Type first number");
            num1 = Integer.parseInt(br.readLine());
            System.out.println("Type operator: ");
            operator = br.readLine();
            System.out.println("Type second number: ");
            num2 = Integer.parseInt(br.readLine());
            operations opr = new operations(num1, num2, operator);
            System.out.println("Okay result is: ");
            if (operator.equals("+")) {
                System.out.println(opr.Add());
            }else if (operator.equals("-")) {
                System.out.println(opr.Minus());
            }else if (operator.equals("*")) {
                System.out.println(opr.Multiply());
            }else if (operator.equals("/")) {
                System.out.println(opr.Divide());
            }else {
                System.out.println("Sorry operator not found!");
            }
            System.out.println("Do you want to continue? ");
            get_continue = br.readLine();
            if (get_continue.equals("no")) {
                break;
            }


        }catch (ArithmeticException e) {
            System.out.println("Error while executing");
        }catch (IOException e) {
            System.out.println("Error while inputing your data");
        }catch (NumberFormatException e) {
            System.out.println("Your input should be Integers");
        }
    }
        
    }
}
