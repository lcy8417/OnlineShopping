package org.onlineshopping.ItemState;

import org.onlineshopping.HandleItems.ItemClass;

public class ItemAvailState extends ItemClass implements ItemStateInterface {
	private static ItemStateInterface state = new ItemAvailState_order();

    @Override
    public void setItemAvailability(Boolean isAvail, int Item_Id){
        ItemClass.Available[Item_Id] = true;
        ItemClass.decription = "product in stock";
    }

    public static ItemStateInterface getInstance(){
        return state;
    }
}