package org.onlineshopping.ItemState;

import org.onlineshopping.HandleItems.ItemClass;

public class ItemAvailState_order extends ItemClass implements ItemStateInterface {
	private static ItemStateInterface state = new ItemNotAvailState();

    @Override
    public void setItemAvailability(Boolean isAvail, int Item_Id){
        ItemClass.Available[Item_Id] = true;
        ItemClass.decription = "product in preparation";
    }

    public static ItemStateInterface getInstance(){
        return state;
    }
}


