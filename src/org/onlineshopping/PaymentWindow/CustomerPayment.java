package org.onlineshopping.PaymentWindow;

import org.onlineshopping.ClientPage.Common;
import org.onlineshopping.items.Items;


public class CustomerPayment extends Payment {
Items items=new Items();


	@Override
	public void Pay(int Method) {
		Online online=new Online();
		// TODO Auto-generated method stub
		switch (Method) {
		case 1:
			Common.BlankSpaces();
			online.CreditCard(0, 0, "0", 0);
			break;
			
		case 2:
			Common.BlankSpaces();
			online.DebitCard(0, 0, "0", 0);
			break;

		case 3:
			Common.BlankSpaces();
			online.Paypal("UserName","Password",0);
			break;

		default:
			Common.BlankSpaces();
			try
			{
			items.DisplayItems();
			}
			catch(Exception we){}
			break;
		}
	}
	

	}
