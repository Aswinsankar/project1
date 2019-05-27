package frameworkpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObjects extends BasePage {
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement headcount;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	private List<WebElement> lstProduct;
	
	@FindBy(xpath=("//button[@type='submit'][@name='Submit']"))
	private WebElement Addtocart;
	
//	@FindBys(@FindBy(xpath=""))
//	private List<WebElement> lstProduct;
	
	
	
	@FindBy(xpath="//div/ul/li[2]//*[text()='Dresses']")
	private WebElement dressesTab;
	
	@FindBy(xpath="//span//preceding::a[last()-28]")
	private WebElement smallSize;
	
	@FindBy(xpath="//span//preceding::a[last()-29]")
	private WebElement mediumSize;
	
	@FindBy(xpath="//span//preceding::a[last()-30]")
	private WebElement largeSize;
	
	@FindBy(xpath="//span//preceding::a[last()-34]")
	private WebElement clickProduct;	
	
	@FindBy(xpath=("//button[@type='submit'][@name='Submit']"))
	private WebElement addToCart;
	
	@FindBy(xpath="//i[@class='icon-ok']")
	private WebElement cartAddedSuccess;
	
	//@FindBy(xpath="//*[@id='homefeatured']/li[1]/div/div[2]/h5/a[@class='product-name']")
	@FindBy(xpath="//*[@class='product_list grid row']/li[1]/div/div[2]/h5/a[@class='product-name']")

	private WebElement clickProduct1;
	
	
public DressesPageObjects()
{
	PageFactory.initElements(driver, this);
}

public int getProductCount()
{
	return lstProduct.size();
}
public int getProductCountFromHeader()
{
	/*String msg=headcount.getText();
	String[] arr=msg.split("");
	String text=arr[2];
	int value=Integer.parseInt(text);
	return value;
	*/
	return Integer.parseInt(headcount.getText().split("")[2]);
}


public boolean getSmallSize()
{
	dressesTab.click();
	boolean str=smallSize.isDisplayed();
	return str;
}

public boolean getMediumSize()
{
	dressesTab.click();
	boolean str=mediumSize.isDisplayed();
	return str;
}
public boolean getLargeSize()
{
	dressesTab.click();
	boolean str=largeSize.isDisplayed();
	return str;
}

public void clickFirstProduct()
{
	clickProduct.click();
	addToCart.click();
}


public String getProductAddedcart()
{
	return cartAddedSuccess.getText();
}

public boolean addcartdispalyaedOnProductPage()
{
	dressesTab.click();
	
	clickProduct1.click();
	boolean cart=Addtocart.isDisplayed();
	Addtocart.click();
	System.out.println("cart is displayed === "+cart);
	return cart;
}

}
