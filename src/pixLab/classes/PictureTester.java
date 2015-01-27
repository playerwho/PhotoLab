package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
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
	 Picture kitten2 = new Picture("jenny-red.jpg");
	 kitten2.explore();
	 kitten2.grayScale();
	 kitten2.explore();
  }
  
  public static void testFixUnderWater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.underWater();
	  water.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowMan = new Picture ("snowman.jpg");
	  snowMan.explore();
	  snowMan.mirrorArms();
	  snowMan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayScale();
    //testFixUnderWater();
    //testMirrorVertical();
    //testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}