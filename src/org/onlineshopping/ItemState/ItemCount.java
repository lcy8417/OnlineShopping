package org.onlineshopping.ItemState;

import org.onlineshopping.HandleItems.ItemClass;

public class ItemCount {
	public int GetNumberOfItems(){
		//int StaticItems=5;
		int DynamicItems=0;
		for(int i=0;i<ItemClass.newitem.size();i++){
		 String Data= ItemClass.newitem.get(i);
		 String[] DataArray;
		 DataArray=Data.split(",");
		 String Avail=DataArray[4].toString();
		 if(Avail.equals("Available")){
			 ++DynamicItems;
		 }
		}
		int TotalAvailableItems=DynamicItems;
		return TotalAvailableItems;
	}
}
