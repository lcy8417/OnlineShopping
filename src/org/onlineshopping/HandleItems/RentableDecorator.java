package org.onlineshopping.HandleItems;

public abstract class RentableDecorator {
	private int TotalNumberOfItems=4;
	
public int getTotalNumberOfItems() {
		return TotalNumberOfItems;
	}
	public void setTotalNumberOfItems() {
		TotalNumberOfItems = TotalNumberOfItems-1;
	}
public abstract void RentItemByItemId(int Item_Id);

}
