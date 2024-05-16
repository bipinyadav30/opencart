package org.opencart.elementpages;

import org.opencart.pageselements.CheckOutPageOR;
import org.opencart.webutils.Webutils1;

public class CheckOutPage extends CheckOutPageOR {

	private Webutils1 wt;
	public CheckOutPage(Webutils1 wu) {
		super(wu);
		this.wt=wu;
	}
	
	public void clickOnGuestCheckOut() {
		wt.click(getGuestAccountBT());
	}
	public void clickOnContinue() {
		wt.click(getContinueBT());
	}
	
}
