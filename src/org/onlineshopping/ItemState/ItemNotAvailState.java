package org.onlineshopping.ItemState;

import org.onlineshopping.HandleItems.ItemClass;

public class ItemNotAvailState extends ItemClass implements ItemStateInterface {
	private static ItemStateInterface state = new ItemAvailState_order();

    @Override
    public void setItemAvailability(Boolean isAvail, int Item_Id){
        ItemClass.Available[Item_Id] = false;
        ItemClass.decription = "SOLD OUT";
    }

    public static ItemStateInterface getInstance(){
        return state;
    }
}


