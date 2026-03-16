package com.kailu.activity_scheduler.activity;

public class RidingBikeActivity extends AbstractActivity {

    @Override
    public void prepare() {
        System.out.println("I am preparing clothing");
    }

    @Override
    public void coreAction() {
        System.out.println("I am riding");
    }
}
