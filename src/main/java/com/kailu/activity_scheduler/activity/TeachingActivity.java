package com.kailu.activity_scheduler.activity;

public class TeachingActivity extends AbstractActivity {

    @Override
    public void prepare() {
        System.out.println("I am preparing notebooks");
    }

    @Override
    public void coreAction() {
        System.out.println("I am teaching");
    }
}
