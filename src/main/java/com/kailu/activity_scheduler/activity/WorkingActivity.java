package com.kailu.activity_scheduler.activity;

public class WorkingActivity extends AbstractActivity {

    @Override
    public void prepare() {
        System.out.println("I am preparing safety boots");
    }

    @Override
    public void coreAction() {
        System.out.println("I am working");
    }
}
