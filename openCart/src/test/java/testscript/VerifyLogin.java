package testscript;

import org.opencart.elementpages.AddToCardPage;
import org.opencart.elementpages.CheckOutPage;
import org.opencart.elementpages.ProductPage;
import org.opencart.webutils.Webutils1;

public class VerifyLogin {
	 Webutils1 driver;
	
	 public static void main(String[] args) {
		 VerifyLogin vl=new VerifyLogin();
		 vl.Verifylogin();
	}
	 
	public void Verifylogin() {
		Webutils1 wu=Webutils1.getInstance();
		wu.launchBrowser("https://awesomeqa.com/ui/");
		wu.holdOn(3);
		ProductPage pp=new ProductPage(wu);
		pp.clickOnSearchBox();
		wu.holdOn(3);
		pp.enterValueInSearchBox("iPhone");
		pp.clickOnsearchButton();
		pp.clickOnProductImage();
		wu.holdOn(3);
		pp.verifyProductName("iPhone");
		pp.verifyProductBrand("Apple");
		pp.verifyProductCode("Product Code: product 11");
		AddToCardPage atc=new AddToCardPage(wu);
		atc.clickOnAddToCart();
		atc.addToCartIcon();
		atc.clickOnCheckOutBT();
		CheckOutPage cop=new CheckOutPage(wu);
		cop.clickOnGuestCheckOut();
		cop.clickOnContinue();
		
	}

	
	}
	
	
	
	
	
	

