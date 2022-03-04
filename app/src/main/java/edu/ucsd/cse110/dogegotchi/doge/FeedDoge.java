package edu.ucsd.cse110.dogegotchi.doge;

import android.view.View;

import edu.ucsd.cse110.dogegotchi.R;

public class FeedDoge implements IDogeObserver{
    View view;
    Doge doge;

    public FeedDoge(View view, Doge doge){
        this.view=view;
        this.doge=doge;
    }

    @Override
    public void onStateChange(Doge.State newState) {
        if(newState.equals(Doge.State.SAD)){
            view.setVisibility(View.VISIBLE);
        }else{
            view.setVisibility(View.GONE);
        }
    }

    @Override
    public void onFoodChange(Doge.Food newFood) {
        if(newFood.equals(Doge.Food.DOGBONE)){

        }else if(newFood.equals(Doge.Food.TURKEY)){

        }else if(newFood.equals(Doge.Food.STEAK)){

        }
    }

    public void onFeedClicked(Doge.Food newFood) {
        doge.feed(newFood);
    }
}
