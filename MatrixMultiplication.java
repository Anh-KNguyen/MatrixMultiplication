package matrix.multiplication;

import java.util.Random;  //import Random
import java.util.Scanner;  //import Scanner

public class MatrixMultiplication {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  //for input
        System.out.println("Enter an integer (N).");  //user directions
        System.out.println("I will create 2 NxN matrices, fill them with random numbers (1-10), and perform matrix multiplication.");
        
        int n = input.nextInt(); //entered number will be an int
        input.close();

        int[][] firstMatrix = new int[n][n];  //first matrix
        int[][] secondMatrix = new int[n][n];  //second matrix
        int[][] finalMatrix = new int[n][n];  //third matrix
        
        Random randomNums = new Random();  //for random
        
        int min = 1;  //setting min
        int max = 10;  //setting max
        
        //first matrix
        //first matrix with random numbers
        //2 for loops because 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //first matrix filled with random numbers
                firstMatrix[i][j] = randomNums.nextInt(max-min) + min;
            }
        }
        
        //second matrix
        //second matrix with random numbers
        //2 for loops because 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //second matrix filled with random numbers
                secondMatrix[i][j] = randomNums.nextInt(max-min) + min;
            }           
        }
        
        //Multiplying
        //final matrix (a multiplication of the first and second matrix
        //3 for loops because of matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    //multiplying first and second matrix for final matrix
                    finalMatrix[i][j] = finalMatrix[i][j] + firstMatrix[i][k] * secondMatrix[k][j];               
                }
            }
        }
        
        System.out.println("Final matrix:");  //user knowledge of final matrix
        //printing final matrix
        //2 for loops because 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //printing final matrix
                System.out.print(finalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
