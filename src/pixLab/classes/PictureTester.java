package pixLab.classes;

/**
 * This class contains class (static) methods that will help you test the Picture class methods. Uncomment the methods and the code in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester
{
	/** Method to test zeroBlue */
	public static void testZeroBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/** tests only blue */
	public static void testOnlyBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.onlyBlue();
		beach.explore();
	}

	/** keeps only red */
	public static void testKeepOnlyRed()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.onlyRed();
		beach.explore();
	}

	/** keeps only green */
	public static void testKeepOnlyGreen()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.onlyGreen();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple()
	{
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/** negates the color of the picture */
	public static void testNegate()
	{
		Picture swan = new Picture("swan.jpg");
		swan.explore();
		swan.negateColor();
		swan.explore();
	}

	/** tests greyscale */
	public static void testGrayScale()
	{
		Picture kitten2 = new Picture("kitten2.jpg");
		kitten2.explore();
		kitten2.grayScale();
		kitten2.explore();
	}

	/**
	 * test for fixUnderWater method
	 */
	public static void testFixUnderWater()
	{
		Picture water = new Picture("water.jpg");
		water.explore();
		water.underWater();
		water.explore();
	}

	/*
	 * method to test mirrorArms
	 */
	public static void testMirrorArms()
	{
		Picture snowMan = new Picture("snowman.jpg");
		snowMan.explore();
		snowMan.mirrorArms();
		snowMan.explore();
	}

	/**
	 * method that tests the mirrorGull method
	 */
	public static void testMirrorGull()
	{
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.mirrorGull();
		gull.explore();
	}

	/**
	 * sets a picture to a sepia tone
	 */
	public static void testSepiaTone()
	{
		Picture snowMan = new Picture("snowman.jpg");
		snowMan.explore();
		snowMan.sepiaTone();
		snowMan.explore();
	}

	/**
	 * method to test Noizy which sets pixels in every other row to either black or white
	 */
	public static void testNoizy()
	{
		Picture motor = new Picture("blueMotorcycle.jpg");
		motor.explore();
		motor.noizy();
		motor.explore();
	}

	/**
	 * method that tests completeNoize which sets every pixel to either black or white
	 */
	public static void testCompleteNoize()
	{
		Picture look = new Picture("femaleLionAndHall.jpg");
		look.explore();
		look.completeNoize();
		look.explore();
	}

	public static void testMirrorDiagonal()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();
	}

	public static void testMirrorRightToLeft()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorRightToLeft();
		beach.explore();
	}

	public static void testHorizontal()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorHorizontal();
		beach.explore();
	}

	public static void testBottomToTop()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorBottom();
		beach.explore();
	}
	
	public static void testCopy()
	{
		Picture beach = new Picture("beach.jpg");
		Picture cycle = new Picture("redMotorcycle.jpg");
		beach.explore();
		beach.copy(cycle, 80, 270);
		beach.explore();
		
	}
	
	public static void testEdgeDetection2()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.edgeDetection2(10);
		beach.explore();
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args)
	{
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		testNoizy();
		testCompleteNoize();
		testSepiaTone();
		testZeroBlue();
		testOnlyBlue();
		testKeepOnlyRed();
		testKeepOnlyGreen();
		testNegate();
		testGrayScale();
		testFixUnderWater();
		testMirrorVertical();
		testMirrorRightToLeft();
		testHorizontal();
		testBottomToTop();
		testMirrorTemple();
		testMirrorArms();
		testMirrorGull();
		testMirrorDiagonal();
		testCollage();
		testCopy();
		testEdgeDetection();
		testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}