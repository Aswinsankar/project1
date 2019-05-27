package frameworktest;

import org.testng.Assert;
import org.testng.annotations.Test;

import frameworkpages.DressesPageObjects;
import frameworkpages.HomePageObjects;

public class DressesPageTest {	
	HomePageObjects hp;
	DressesPageObjects dpo;

public DressesPageTest()
{
	hp=new HomePageObjects();	
	dpo=new DressesPageObjects();
}
@Test(enabled=false)
public void verifyProductCount()
{
Assert.assertTrue(dpo.getProductCount()==dpo.getProductCountFromHeader(), "Count Mismatched");
}

	//Verify Dresses tab is displayed on Home Page

@Test(enabled=false, priority=1)
	public void verifyDressesTab()
	{
		String dresstabname=hp.getDressesTab();
		Assert.assertTrue(dresstabname.contains("DRESSES"), "Dress tab is not present on home page");
	}

	//Verifying the page navigated corresponding Dresses page
	@Test(enabled=false)
	public void pageNavigatedToDressPage()
	{
		String title=hp.getTxtDresstitle();
		//System.out.println(title);
		Assert.assertTrue(title.contains("Dress"), "The page navigated wrongly");
		}
	
	//Verifying Small size is displayed
	@Test(enabled=false)
	public void verifySmallSize()
	{
	Assert.assertTrue(dpo.getSmallSize());
	}
	
	//Verifying Medium size is displayed

	@Test(enabled=false)
	public void verifyMediumSize()
	{
	Assert.assertTrue(dpo.getMediumSize());
	}
	
	//Verifying large size is displayed
	@Test(enabled=false)
	public void verifyLargeSize()
	{
	Assert.assertTrue(dpo.getLargeSize());
	}
	//Add first product and verify its added to cart
	@Test(enabled=false)
	public void verifyProductAddedIntoCart()
	{
		String str=dpo.getProductAddedcart();
				System.out.println(str);
		Assert.assertTrue(dpo.getProductAddedcart().contains("success"), "");
	}
	
	@Test
	public void CheckAddCart() {
		boolean res =dpo.addcartdispalyaedOnProductPage();
		Assert.assertTrue(res, "Failed");

	}
}	

