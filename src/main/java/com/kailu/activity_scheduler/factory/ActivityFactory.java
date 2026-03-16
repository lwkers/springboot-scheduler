package com.kailu.activity_scheduler.factory;

import com.kailu.activity_scheduler.activity.*;

public class ActivityFactory {

    public static AbstractActivity findAction(String input){
        if (input == null ){
            return null;
        }

        String day = input.trim().toLowerCase();

        switch (day){
            case"monday":
            case "mon":
                return new FishingActivity();

            case"tuesday":
            case"tue":
                return new WorkingActivity();

            case"wednesday":
            case"wed":
                return new TeachingActivity();

            case "thursday":
            case "thu":
                return new GamingActivity();

            case"friday":
            case"fri":
                return new HikingActivity();

            case"saturday":
            case"sat":
                return new RidingBikeActivity();

            case"sunday":
            case "sun":
                return new TakingARestActivity();

            default:
                return null;
        }

    }

}


