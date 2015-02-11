package pixLab.classes;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
	// /////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture()
	{
		/*
		 * not needed but use it to show students the implicit call to super() child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width)
	{
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image)
	{
		super(image);
	}

	// //////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height and width.
	 */
	public String toString()
	{
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
			}
		}
	}

	/** method to set red and green to 0 */
	public void onlyBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	/** method to remove blue and green */
	public void onlyRed()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}
		}
	}

	/** method to set red and blue to 0 */
	public void onlyGreen()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setBlue(0);
			}
		}
	}

	/** method to set a positive image to negative */
	public void negateColor()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setRed(255 - pixelObj.getRed());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the picture from left to right
	 */
	public void mirrorVertical()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	
	/**
	 * mirrors the stupid bird to the other side of the screen
	 */
	public void mirrorGull()
	{
		int mirrorPoint = 366;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		
		for(int row = 228; row < mirrorPoint; row++)
		{
			for(int col = 85; col < 347; col++)
			{
				leftPixel = pixels[row][col ];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
				
		}
	}
	
	/**
	 * filter to change picture to sepia tone
	 */
	public void sepiaTone()
	{
		Pixel [][] imageMatrix = this.getPixels2D();
		
		for(int row = 0; row < imageMatrix.length; row ++)
		{
			for(int col = 0; col < imageMatrix[0].length; col++)
			{
				//pseudocode for filter
				/**
				 * change pixels to tints of brown
				 * (112,66,20) to (255,255,255)
				 * cut red to fit between 112-255
				 * shift green to half of red
				 * shift blue to 1/3 of green
				 */
				Pixel sepiaPixel = imageMatrix[row][col];
				int averageColor = (sepiaPixel.getRed() + sepiaPixel.getGreen() + sepiaPixel.getBlue()) /3;
				if (averageColor < 85)
				{
					sepiaPixel.setGreen(sepiaPixel.getRed()/2);
					sepiaPixel.setBlue(sepiaPixel.getGreen()/3);
				}
				else
				{
					sepiaPixel.setRed((int)(sepiaPixel.getRed() * 0.9));
					sepiaPixel.setGreen((int)(sepiaPixel.getRed()* 0.8));
					sepiaPixel.setBlue((int)(sepiaPixel.getRed()* 0.4));
				}
				
			}
		}
	}
	
	/**
	 * method that sets pixels in every other row to either black or white
	 */
	public void noizy()
	{
		Pixel [][] imageMatrix = this.getPixels2D();
		for (int row = 0; row < imageMatrix.length; row += 2)
		{
			for(int col = 0; col < imageMatrix[0].length; col++)
			{
				int randomNoize = (int) (Math.random() * 2);
				if(randomNoize == 1)
				{
					imageMatrix[row][col].setRed(0);
					imageMatrix[row][col].setGreen(0);
					imageMatrix[row][col].setBlue(0);
				}
				else
				{
					imageMatrix[row][col].setBlue(255);
					imageMatrix[row][col].setRed(255);
					imageMatrix[row][col].setGreen(255);
				}			
			}
		}
	}
	
	/**
	 * method that sets every pixel to either black or white
	 */
	public void completeNoize()
	{
		Pixel [][] imageMatrix = this.getPixels2D();
		for (int row = 0; row < imageMatrix.length; row ++)
		{
			for(int col = 0; col < imageMatrix[0].length; col++)
			{
				int randomNoize = (int) (Math.random() * 2);
				if(randomNoize == 1)
				{
					imageMatrix[row][col].setRed(0);
					imageMatrix[row][col].setGreen(0);
					imageMatrix[row][col].setBlue(0);
				}
				else
				{
					imageMatrix[row][col].setBlue(255);
					imageMatrix[row][col].setRed(255);
					imageMatrix[row][col].setGreen(255);
				}			
			}
		}
	}
	
	/** Mirror just part of a picture of a temple */
	public void mirrorTemple()
	{
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++)
			{
                count ++;
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				System.out.println(count);
			}
		}
	}
	
	/**
	 * mirrors the arms of the snowman.jpg
	 */
	public void mirrorArms()
	{
		int mirrorPoint = 225;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();
		
		for(int row = 162; row < mirrorPoint; row++)
		{
			for(int col = 92; col < 297; col++)
			{
				topPixel = pixels[row][col];
				bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				bottomPixel.setColor(topPixel.getColor());
			}
				
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
		{
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	
	public void partialCopy(Picture fromPic, int startRow, int startCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
		{
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage()
	{
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < pixels[0].length - 1; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	/**
	 * sets the current picture to greyscale
	 */
	public void grayScale()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				int grayColor = (pixelObj.getGreen() + pixelObj.getRed() + pixelObj.getBlue()) / 3;
				pixelObj.setGreen(grayColor);
				pixelObj.setBlue(grayColor);
				pixelObj.setRed(grayColor);
			}
		}
	}

	/**
	 * makes the fish in water.jpg clearer to see
	 */
	public void underWater()
	{	
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				int red = pixelObj.getRed();
				int blue = pixelObj.getBlue();
				
				if(red > 23 & blue > 150)
				{
					pixelObj.setRed(red * 2);	
				}
			}
		}		
	}
	
	
	/**
	 * mirrors a picture across a diagonal line
	 */
	public void mirrorDiagonal()
	{
		Pixel leftPixel = null;
		Pixel topPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		
		for(int row = 0; row < pixels.length; row++)
		{
			for(int col = 0; col < pixels[0].length; col++)
			{
				leftPixel = pixels[(int) (col/1.339)][row];
				topPixel = pixels[row][(int) (col/1.339)];
				topPixel.setColor(leftPixel.getColor());
			}
				
		}	
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args)
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();
	}

} // this } is the end of class Picture, put all new methods before this
