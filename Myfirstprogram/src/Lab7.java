//Hunter Earnhardt

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//matrix1 rows
		System.out.println("Enter the rows of Matrix1: ");
		int mat1_rows = key.nextInt();
		
		//matrix1 columns
		System.out.println("Enter the number of columns in matrix1: ");
		int mat1_cols = key.nextInt();
		
		//matrix2 rows
		System.out.println("Enter the number of rows in matrix2: ");
		int mat2_rows = key.nextInt();
		
		//matrix2 columns
		System.out.println("Enter the number of columns in matrix2: ");
		int mat2_cols = key.nextInt();
		
		//Checking to make sure the columns match
		while(mat1_cols != mat2_cols)
		{
			System.out.println("The number of colums of matrix 1 does not equal the colums of matrix 2.");
			
			System.out.println("Please enter a valid value for matrix1's colums.");
			mat1_cols = key.nextInt();
			
			System.out.println("Please enter a valid value for matrix2's colums.");
			mat2_cols = key.nextInt();
		}
		
		//Checking to make sure the rows match
		while(mat1_rows != mat2_rows)
		{
			System.out.println("The number of rows of matrix 1 does not equal the rows of matrix 2.");
			
			System.out.println("Please enter the correct number for matrix 1's rows.");
			mat1_rows = key.nextInt();
			
			System.out.println("Please enter the correct number for matrix 2's rows.");
			mat2_rows = key.nextInt();
		}
		
		// creating the 2 matrixes
				int[][] matrix1 = new int[mat1_rows][mat1_cols];
				
				int[][] matrix2 = new int[mat2_rows][mat2_cols];
				
				//first matrix imputes
				for(int i = 0; i < mat1_rows; i++)
				{
					for(int j = 0; j < mat1_cols; j++)
					{
						System.out.println("Enter the value of the first matrix at position (" +i+ "," +j+ "):");
						matrix1[i][j] = key.nextInt();
					}
				}
				
				//second matrix imputes
				for(int i = 0; i < mat2_rows; i++)
				{
					for(int j = 0; j < mat2_cols; j++)
					{
						System.out.println("Enter the value of the second matrix at position (" +i+ "," +j+ "):");
						matrix2[i][j] = key.nextInt();
					}
				}
				
		int[][] productMatrix = new int[mat1_rows][mat1_cols];
				
		int sum = 0;
		
		//adding the matrixes
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				sum += matrix1[i][j] + matrix2[i][j];
				productMatrix[i][j] = sum;
				sum = 0;
			}
		}
		
		//print the answer
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				System.out.print(productMatrix[i][j]+" ");		
			}
			System.out.println();
		}
		
	}

}
