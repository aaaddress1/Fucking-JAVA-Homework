/**
*			Two Array Add/Sub/Mul/Cmp 
*	Author:	aaaddress1@gmail.com
*	Date:	2015/11/6
**/
import java.io.*;
public class TwoDimArray1 {
	public static void main(String[] args) throws IOException {
		int[][] A = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
		int[][] B = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
		int[][] C = new int[3][4];
		int[][] D = { { 111	, 22}	, {	333	,56	}};
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		for (boolean continueMenu = true;continueMenu;) 
		{
			System.out.print(
				 "\n" +
				 "A:a[]+b[]\n" +
				 "B:a[]-b[]\n" +
				 "C:a[]*b[]\n" +
				 "D:a[]+d[]\n" +
				 "E:Exit\n"
				 );
			String text = buf.readLine(); 
			int Mode = 0; //Default.

			switch (text)
			{
				case "A":
					System.out.print("A[]+B[] = ");
					Mode = 1;
					break;
				case "B":
					System.out.print("A[]-B[] = ");
					Mode = 2;
					break;
				case "C":
					System.out.print("A[]*B[] = ");
					Mode = 3;
					break;
				case "D":
					Mode = 4;
					break;
				case "E":
					continueMenu = false;
					continue;
				default:
					continue;
			}
			if (Mode == 4)
			{
					if (A[0].length != D[0].length) 
					{
						System.out.print("the count of A's col and D's col are not equal!\n");
						System.out.print("so, A[] Cannot be added to D[]\n");
						continue;
					}
					else if (A.length == D.length)
					{
						System.out.print("the count of A's row and D's row are not equal!\n");
						System.out.print("so, A[] Cannot be added to D[]\n");
						continue;
					} 
			}
			else	for (int i = 0, j = 0; i < 3;) 
					{
							 if (Mode == 1) C[i][j] = A[i][j] + B[i][j];
						else if (Mode == 2) C[i][j] = A[i][j] - B[i][j];
						else if (Mode == 3) C[i][j] = A[i][j] * B[i][j];
						if (j++ == 3) 
						{
							j = 0;
							i++;
						}
					}

			/* Print C[3][4] Array */
			System.out.print("{ ");
			for (int i = 0, j = 0; i < 3;) 
			{
				if (j == 0) System.out.print("{");
				System.out.print(C[i][j]);
				if (j++ == 3) 
				{
					j = 0;
					i++;
					System.out.print("}");
					if (i != 3) System.out.print(" ,");
				}
				else System.out.print(",");
			}
			System.out.print(" }");
			/* Print C[3][4] Array Over */
		}
	}

}
