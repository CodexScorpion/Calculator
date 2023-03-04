/*
Name: Joshua Lobo
PRN: 21070126127
Batch: AIML B3

OS: Mac OS 12.2.1 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/


//Importing Libraries 
import java.util.*;
import java.io.*;
public class Main {

    static double numbers[];
    static double result[];

    //Main Function 
    public static void main(String[] args) {

        UserInput input = new UserInput();
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);


        //User Input - Options  
        System.out.println("Enter Operator for Operaton: ");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for multiplication ");
        System.out.println("/ for division ");
        System.out.println("! for array operations");

        char operator = scan.next().charAt(0);


        //Switch Case 
        switch (operator) {
            case '+':

                numbers = input.inputTwonumbers();
                result = calculator.performAdditionoperation(numbers);
                System.out.println("Sum is: " + result[0]);
                break;

            case '-':
                numbers = input.inputTwonumbers();
                result = calculator.performSubtractionoperation(numbers);
                System.out.println("Result is: " + result[0]);
            break;

            case '*':
            numbers = input.inputTwonumbers();
            result = calculator.performMultiplicationoperation(numbers);
            System.out.println("Product of numbers  is: " + result[0]);
            break;

            case '/':
            numbers = input.inputTwonumbers();
            result = calculator.performDivisionoperation(numbers);
            System.out.println("Division of numbers is: " + result[0]);
            break;

            case'!':
            try{
            numbers=input.inputMultiplenumbers();
            result=calculator.performArrayoperation(numbers);
            }


            //IOException: Base class for exceptions 
            //e: Name of any variable.
            catch(IOException e)
            {        
                System.out.println("Array is empty");
            }
            System.out.println("Addition of array elements : "+result[0]);
            System.out.println("Subtraction of array elements : "+result[1]);
            System.out.println("Multiplication of array elements : "+result[2]);
            System.out.println("Division of array elements :"+result[3]);
            System.out.println("Mean of array elements : "+result[4]);
            System.out.println("Variance of array elements : "+result[5]);
            System.out.println("Standard Deviation of array elements : "+result[6]);





        }

    }
}
