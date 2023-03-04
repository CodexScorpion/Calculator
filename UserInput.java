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

import java.util.Scanner;
import java.io.*;

//Public Class for accesibility from Calculator and Main
public class UserInput
{
    double[]numbers = new double[2];
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public double[] inputTwonumbers()
    {
        System.out.println("Enter First Number:");
        numbers[0] = sc.nextDouble();

        System.out.println("Enter Second Number:");
        numbers[1] = sc.nextDouble();

        return numbers;

    }
    

    public double[] inputMultiplenumbers() throws IOException   
    { 
    //IOEXCEPTION is thrown as use of Buffer Reader which acceses different datatypes 
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();

        double array[] = new double[size];
        String str = br.readLine();
        String[] array_numbers = str.trim().split("\\s+");
        for(int i=0;i<size;i++)
        {
            array[i] = Double.parseDouble(array_numbers[i]);
        }
        return array;
    }
}