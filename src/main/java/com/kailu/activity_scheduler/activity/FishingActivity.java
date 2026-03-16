package com.kailu.activity_scheduler.activity;

public class FishingActivity extends AbstractActivity {

    @Override
    public void prepare() {
        System.out.println("I am preparing rod and bait");
    }

    @Override
    public void coreAction() {
        System.out.println("I am finishing");
    }
}
