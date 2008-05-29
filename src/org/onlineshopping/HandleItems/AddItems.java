package org.onlineshopping.HandleItems;

public class AddItems {
ItemClass itemclass=new ItemClass();
public int GetTotalNumberOfItems()
{
	return itemclass.get_NumberOfItems();
}

public void SetTotalNumberOfItems(int No)
{
	itemclass.set_NumberOfItems(No);
}

public void DisplayDynamicItems(int no)
{
	itemclass.DisplayDynamicItems(no);
}

public void AddItem(int no) {
	itemclass.AddItem(no);	
}

}
