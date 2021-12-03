package org.onlineshopping.HandleItems;

import org.onlineshopping.PaymentWindow.PaymentOptions;

public class RentItem extends RentableDecorator {

	@Override
	public void RentItemByItemId(int Item_Id) {
		PaymentOptions paymentoptions=new PaymentOptions();
		try{
			setTotalNumberOfItems();
		paymentoptions.BuyItemMenu();
		}
		catch(Exception er){
			
		}
	}

}
