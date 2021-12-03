package org.onlineshopping.HandleItems;

import java.util.ArrayList;

public class UpdateItem {
	ItemClass itemclass=new ItemClass();
	
	
	public ArrayList<String> GetItems() {
		ArrayList<String> items=new ArrayList<String>();
		items=itemclass.GetListOfDynamicItems();
		return items;
	}
	
	public void UpdateItemInList()
	{
		itemclass.UpdateItemFromArrayList();
	}
	
}
