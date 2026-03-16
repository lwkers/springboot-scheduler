package com.kailu.activity_scheduler.activity;

public abstract class AbstractActivity {
    public void doAction(){
        prepare();
        coreAction();
        finish();
    }

    abstract void prepare();
    abstract void coreAction();
    void finish(){
        System.out.println("Go Home");
    }
}
