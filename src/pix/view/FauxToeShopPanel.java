package pix.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import pix.controller.FauxToeShopController;
import pixLab.classes.ImageDisplay;
import pixLab.classes.Picture;

import java.awt.FlowLayout;

public class FauxToeShopPanel extends JPanel
{
	private FauxToeShopController baseController;

	private JComboBox<String> filterBox;
	private JScrollPane imagePane;
	private SpringLayout baseLayout;
	private Picture basePicture;
	private String[] imageArray;
	private JComboBox<String> imageBox;

	public FauxToeShopPanel(FauxToeShopController baseController)
	{
		this.setBaseController(baseController);

		imagePane = new JScrollPane();
		basePicture = new Picture("beach.jpg");
		baseLayout = new SpringLayout();
		

		setupPicture();
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupComboBox()
	{
		String[] filterArray = {

		"testSepiaTone", "testNoizy", "testCompleteNoize", "testZeroBlue", "testKeepOnlyBlue", "testKeepOnlyRed", "testKeepOnlyGreen", "testNegate", "testGrayScale", "testFixUnderWater", "testMirrorVertical", "testMirrorRightToLeft", "testMirrorTemple", "testMirrorArms",
				"testMirrorGull", "testMirrorDiagonal", "testCollage", "testCopy", "testEdgeDetection", "testEdgeDetection2", "testHorizontal", "testBottomToTop", };

		imageArray = new String[] {

		"arch.jpg", "barbaraS.jpg", "beach.jpg", "blue-mark.jpg", "blueMotorcycle.jpg", "butterfly1.jpg", "flower1.jpg", "gorge.jpg", "heli.jpg", "msg.jpg", "water.jpg", };

		filterBox = new JComboBox(filterArray);
		imageBox = new JComboBox(imageArray);
		baseLayout.putConstraint(SpringLayout.WEST, imageBox, 150, SpringLayout.WEST, this);

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(filterBox);
		this.add(imagePane);
		this.add(imageBox);
	}

	private void setupPicture()
	{
		BufferedImage bufferedPic = basePicture.getBufferedImage();
		ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
		// FlowLayout flowLayout = (FlowLayout) picDisplay.getLayout();
		imagePane.setViewportView(picDisplay);
	}

	private void loadPicture()
	{

		basePicture = new Picture(imageArray[imageBox.getSelectedIndex()]);
		setupPicture();
	}

	// private void resetPicture()
	// {
	// BufferedImage bufferedPic = resetPicture.getBufferedImage();
	// ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
	// FlowLayout flowLayout = (FlowLayout) picDisplay.getLayout();
	// imagePane.setViewportView(picDisplay);
	// }

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, filterBox, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, imagePane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, imagePane, 20, SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		imageBox.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent currentEvent)
			{
				if (filterBox.getSelectedIndex() == 0)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 1)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 2)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 3)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 4)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 5)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 6)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 7)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 8)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 9)
				{
					loadPicture();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 10)
				{
					loadPicture();
					setupPicture();
				}
			}
				
				
				
		});
		filterBox.addItemListener(new ItemListener()
		{

			@Override
			public void itemStateChanged(ItemEvent currentEvent)
			{
				if (filterBox.getSelectedIndex() == 0)
				{
					loadPicture();
					basePicture.sepiaTone();
					setupPicture();
				}
				else if (filterBox.getSelectedIndex() == 1)
				{
					loadPicture();
					basePicture.noizy();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 2)
				{
					loadPicture();
					basePicture.completeNoize();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 3)
				{
					loadPicture();
					basePicture.zeroBlue();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 4)
				{
					loadPicture();
					basePicture.onlyBlue();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 5)
				{
					loadPicture();
					basePicture.onlyRed();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 6)
				{
					loadPicture();
					basePicture.onlyGreen();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 7)
				{
					loadPicture();
					basePicture.negateColor();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 8)
				{
					loadPicture();
					basePicture.grayScale();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 9)
				{
					loadPicture();
					basePicture.underWater();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 10)
				{
					loadPicture();
					basePicture.mirrorVertical();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 11)
				{
					loadPicture();
					basePicture.mirrorRightToLeft();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 12)
				{
					loadPicture();
					basePicture.mirrorTemple();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 13)
				{
					loadPicture();
					basePicture.mirrorArms();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 14)
				{
					loadPicture();
					basePicture.mirrorGull();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 15)
				{
					loadPicture();
					basePicture.mirrorDiagonal();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 16)
				{
					loadPicture();
					basePicture.createCollage();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 17)
				{
					loadPicture();
					basePicture.copy(basePicture, 25, 25);
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 18)
				{
					loadPicture();
					basePicture.edgeDetection(10);
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 19)
				{
					loadPicture();
					basePicture.edgeDetection2(10);
					setupPicture();

				} else if (filterBox.getSelectedIndex() == 20)
				{
					loadPicture();
					basePicture.mirrorHorizontal();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 21)
				{
					loadPicture();
					basePicture.mirrorBottom();
					setupPicture();
				} else if (filterBox.getSelectedIndex() == 22)
				{
					loadPicture();
					
					setupPicture();
				}
			}
		});
	}

	public FauxToeShopController getBaseController()
	{
		return baseController;
	}

	public void setBaseController(FauxToeShopController baseController)
	{
		this.baseController = baseController;
	}
}
