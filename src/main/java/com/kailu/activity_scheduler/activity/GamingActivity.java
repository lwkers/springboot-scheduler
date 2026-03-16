package com.kailu.activity_scheduler.activity;

public class GamingActivity extends AbstractActivity {

    @Override
    public void prepare() {
        System.out.println("I am preparing desktop");
    }

    @Override
    public void coreAction() {
        System.out.println("I am playing games");
    }
}
