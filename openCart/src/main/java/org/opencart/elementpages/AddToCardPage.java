package org.opencart.elementpages;

import org.opencart.pageselements.AddToCartPageOR;
import org.opencart.webutils.Webutils1;

import lombok.Getter;


public class AddToCardPage extends AddToCartPageOR{

	private Webutils1 wt;
	public AddToCardPage(Webutils1 wu) {
		super(wu);
		this.wt=wu;
	}
	
	public void clickOnAddToCart() {
		wt.click(getAddToCartBT());
	}
	
	public void addToCartIcon() {
		wt.click(getAddToCartIC());
	}
	
	public void clickOnCheckOutBT() {
		wt.click(getCheckoutBT());
	}
	
	
	
}
