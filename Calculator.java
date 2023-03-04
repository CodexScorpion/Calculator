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
import java.math.*;

//Class Name : File Name 

public class Calculator {
    double[] result =new double[1]; 
   //Array with 2 elements 
    double[] result_array=new double[7]; 
    //Resultant Array 

    //Array Operations 

    public double[]  performAdditionoperation(double[] numbers)
    //Numbers[0] and [1] are array elements
    {   
        result[0]=numbers[0]+numbers[1];
        return result; 
        // Result in array form as the addition of array elements gets saved as an array.
    }
    public double[] performSubtractionoperation(double[] numbers)
    {   
        result[0]=numbers[0]-numbers[1];
        return result;
    }

    public double[] performMultiplicationoperation(double [] numbers )
    {   
        result[0]=numbers[0]*numbers[1];    
        return result;

    }
    public double[] performDivisionoperation(double [] numbers){
        
            result[0]=numbers[0]/numbers[1];
            return result;
    }

    public double[] performArrayoperation(double []numbers){
        int size=numbers.length;
        result_array[0]=0;
         // Initialized to 0 for Addition 
        result_array[2]=1;
         // Initialized to 1 for Multiplication 

        //Array Traversal 
        for (int i=0;i<size;i++)
        { result_array[0]=result_array[0]+numbers[i];
          result_array[2]=result_array[2]*numbers[i];

        };
        result_array[1]=numbers[0];
         //Result:[0]=Addition,1=Subtraction,2=Multiplication,3=Division,4=Mean,5=Variance,6=Standard deviation
        result_array[3]=numbers[0];
         
        for (int i=1;i<size;i++)
        {
            result_array[1]=result_array[1]-numbers[i];
            result_array[3]=result_array[3]/numbers[i];


        };
        result_array[4]=result_array[0]/size;
        double sqdiff=0;
        for (int i=0;i<size;i++)
        {
            
            sqdiff=sqdiff+((numbers[i]-result_array[4])*(numbers[i]-result_array[4]));
            // Sum of square of differences from mean

        };
        //Variance Calculation 
        result_array[5]=sqdiff/size; 
        //Standard Deviation Calculation
        result_array[6]=Math.sqrt(result_array[5]); 

        return result_array;
        

        
             
    }
    
}



















