package org.onlineshopping.BuyingOptions;

import org.onlineshopping.PaymentWindow.Online; 
import org.onlineshopping.ClientPage.Common;

public class Paypal {
Online online=new Online();
	
	public void PaypalPayment(){
		Common.BlankSpaces();
		online.Paypal("UserName", "Password", 0);
	}
}
