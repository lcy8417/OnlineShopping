package org.onlineshopping.HowToPay;

import org.onlineshopping.PaymentWindow.Online; 
import org.onlineshopping.ClientPage.Common;

public class Debit {
Online online=new Online();
	
	public void DebitCardPayment(){
		Common.BlankSpaces();
		online.DebitCard(0, 0, "0", 0);
	}
}
