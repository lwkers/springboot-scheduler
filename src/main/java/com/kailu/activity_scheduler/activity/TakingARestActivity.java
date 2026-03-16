package com.kailu.activity_scheduler.activity;

public class TakingARestActivity extends AbstractActivity {

    @Override
    public void prepare() {
        System.out.println("I am preparing bed sheet");
    }

    @Override
    public void coreAction() {
        System.out.println("I am sleeping");
    }
}
