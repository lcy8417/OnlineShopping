package org.onlineshopping.HowToPay;

import org.onlineshopping.PaymentWindow.Online; 
import org.onlineshopping.ClientPage.Common;

public class Credit {
	Online online=new Online();
	
	public void CreditCardPayment(){
		Common.BlankSpaces();
		online.CreditCard(0, 0, "0", 0);
	}
}
