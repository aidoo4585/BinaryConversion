package kaidoo;
import java.util.Scanner;

public class BinaryConversion {
	public static void main(String [] arhs) {
	Scanner input= new Scanner(System.in);

    System.out.println("Hello, please enter an integer you want to convert to binary");
    int decNumber = input.nextInt();

    decToBinary(decNumber); 
} 
// function to convert decimal to binary 
static void decToBinary(int decNumber) 
{ 
    // array to store binary number 
    int[] binaryNum = new int[32]; 

    // counter for binary array 
    int i = 0; 
    while (decNumber > 0) { 
        // storing remainder in binary array 
        binaryNum[i] = decNumber % 2; 
        decNumber = decNumber / 2; 
        i++; 
    } 

    // printing binary array in reverse order 
    for (int j = i - 1; j >= 0; j--) 
        System.out.print(binaryNum[j]); 
} 
}
