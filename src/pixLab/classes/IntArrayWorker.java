package pixLab.classes;

public class IntArrayWorker
{
	/** two dimensional matrix */
	private int[][] matrix = null;

	/**
	 * set the matrix to the passed one
	 * 
	 * @param theMatrix
	 *            the one to use
	 */
	public void setMatrix(int[][] matrix)
	{
		this.matrix = matrix;
	}

	/**
	 * Method to return the total
	 * 
	 * @return the total of the values in the array
	 */
	public int getTotal()
	{
		int total = 0;
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				total += matrix[row][col];
			}
		}
		return total;
	}

	/**
	 * Method to return the total using a nested for-each loop
	 * 
	 * @return the total of the values in the array For-each loops always has rows first
	 */
	public int getTotalNested()
	{
		int total = 0;
		for (int[] rowArray : matrix)
		{
			for (int item : rowArray)
			{
				total = total + item;
			}
		}
		return total;
	}

	/**
	 * Method to count the amount of rows and columns
	 * 
	 * @param searchValue
	 * @return
	 */
	public int getCount(int searchValue)
  {
		 int count = 0;
		 
		 for(int [] row:matrix)
		 {
			 for(int spot:row)
			 { 
				 if(spot == searchValue)
				 {
					 count++;
				 }
			 }
		 }
		 
		 return count; 
  }
	
	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				if(matrix[row][col] > largest)
				{
					largest = matrix[row][col];
				}
			}
		}
		
//     For loop for getLargest method, same as for each loop.
//		
//		for(int [] row:matrix)
//		 {
//			 for(int value:row)
//			 { 
//				 if(value > largest)
//				 {
//					 largest = value;;
//				 }
//			 }
//		 }
		
		return largest;
	}
	
	public int getColTotal(int colValue)
	{
		int totalCol = 0;
	
//		For each loop for getColTotal
//		
//		for (int row = 0; row < matrix.length; row++)
//		{
//			totalCol += matrix[row][colValue];
//		}
		
		for(int [] row : matrix)
		{
			totalCol += row[colValue];
		}
		
		return totalCol;
	}

	/**
	 * print the values in the array in rows and columns
	 */
	public void print()
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * fill the array with a pattern
	 */
	public void fillPattern1()
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				if (row < col)
				{
					matrix[row][col] = 1;
				} else if (row == col)
				{
					matrix[row][col] = 2;
				} else
				{
					matrix[row][col] = 3;
				}
			}
		}
	}

}