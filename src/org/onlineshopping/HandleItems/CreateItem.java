package org.onlineshopping.HandleItems;

import org.onlineshopping.ClientPage.Common; 
import org.onlineshopping.ClientPage.SellerOptions;

public class CreateItem extends CreateItemDecorator{

	@Override
	public void CreateItems(int no) {
		
		SellerOptions selleroptions=new SellerOptions();
		
		ItemClass itemclass=new ItemClass();
		itemclass.CreateNewItem(no);
		try{
			Common.BlankSpaces();
		selleroptions.MainOptions();
		}
		catch(Exception er){
			System.out.println("Error Occured:"+er.getMessage());
		}
	}

}
