package org.onlineshopping.ItemState;

public class itemStock{
    protected ItemStateInterface itemstate = new ItemNotAvailState();
    
    // 0 = soldout, 1 =  in stock, 2 = can reservation order
    private  int availState;  

    public itemStock(){
        availState =0;
    }

    public void convertAvail(int state){
        if ( availState == state){
            return;
        }

        if (state == 0){
            this.itemstate= ItemAvailState_order.getInstance();
        } else if (state ==1) {
            this.itemstate = ItemAvailState.getInstance();
        } else if (state == 2){
            this.itemstate = ItemAvailState_order.getInstance();
        }
    }
}



