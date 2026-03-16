package com.kailu.activity_scheduler.activity;

public class HikingActivity extends AbstractActivity {

    @Override
    public void prepare() {
        System.out.println("I am preparing shoes");
    }

    @Override
    public void coreAction() {
        System.out.println("I am hiking with a dog");
    }
}
