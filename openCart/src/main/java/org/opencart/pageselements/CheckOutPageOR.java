package org.opencart.pageselements;

import org.opencart.webutils.Webutils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter
public class CheckOutPageOR {

	public CheckOutPageOR(Webutils1 wu) {
		PageFactory.initElements(wu.getDriver(), this);
	}
	
	@FindBy(xpath="//input[@value='guest']")
	protected WebElement guestAccountBT ;
	
	@FindBy(xpath="//input[@id='button-account']")
	protected WebElement continueBT ;
//	
//	@FindBy(xpath="")
//	protected WebElement ;
//	
//	@FindBy(xpath="")
//	protected WebElement ;
//	
//	@FindBy(xpath="")
//	protected WebElement ;
//	
//	@FindBy(xpath="")
//	protected WebElement ;
//	
}
