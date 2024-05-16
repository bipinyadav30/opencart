package org.opencart.elementpages;

import org.opencart.pageselements.ProductOR;
import org.opencart.webutils.Webutils1;

public class ProductPage extends ProductOR {
private Webutils1 wt;
	public ProductPage(Webutils1 wu) {
		super(wu);
		this.wt=wu;
	}
	
	public void clickOnSearchBox() {
		wt.click(searchTB);
	}
	public void enterValueInSearchBox(String searchValue) {
		wt.inputValue(searchTB, searchValue);
	}
	
	public void clickOnsearchButton() {
		wt.click(searchBT);
	}
	public void clickOnProductImage() {
		wt.click(productIM);
	}
	public void verifyProductName(String expectedProductName) {
		wt.verifyInnerText(productNameIT, expectedProductName);
	}
	public void verifyProductBrand(String expectedProductBrand) {
		wt.verifyInnerText(ProductBrandNameIT, expectedProductBrand);
		
	}
	
	public void verifyProductCode(String expectedProductCode) {
		wt.verifyInnerText(productCodeIT, expectedProductCode);
	}
	
	
}
