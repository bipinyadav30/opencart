package org.opencart.pageselements;

import org.opencart.webutils.Webutils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductOR {

	
	public ProductOR(Webutils1 wu) {
		PageFactory.initElements(wu.getDriver(), this);
	}

	//IT=inner text
	//TB= text box
	//BT=button
	//IM=image
	
	
	@FindBy(xpath="//input[@class='form-control input-lg']")
	protected WebElement searchTB;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	protected WebElement searchBT;
	
	@FindBy(xpath="//img[@src='https://awesomeqa.com/ui/image/cache/catalog/demo/iphone_1-228x228.jpg']")
	protected WebElement  productIM;

	
	@FindBy(xpath="//h1[text()='iPhone']")
	protected WebElement productNameIT;
	
	@FindBy(xpath="//a[text()='Apple']")
	protected WebElement ProductBrandNameIT;
	
	@FindBy(xpath="//li[text()='Product Code: product 11']")
	protected WebElement productCodeIT;
	
	
	//@FindBy(xpath="")
//	protected WebElement;
	
	
	
	
	
	
	
}
