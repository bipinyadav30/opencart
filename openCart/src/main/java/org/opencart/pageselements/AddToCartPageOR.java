package org.opencart.pageselements;

import org.opencart.webutils.Webutils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
@Getter
public class AddToCartPageOR {
	
	public AddToCartPageOR(Webutils1 wu) {
		PageFactory.initElements(wu.getDriver(), this);
	}
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	protected WebElement addToCartBT;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	protected WebElement addToCartIC;
	
	@FindBy(xpath = "//strong[contains(text(),' Checkout')]")
	protected WebElement checkoutBT;
}
