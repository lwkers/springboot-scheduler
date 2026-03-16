package com.kailu.activity_scheduler;

import com.kailu.activity_scheduler.activity.AbstractActivity;
import com.kailu.activity_scheduler.activity.FishingActivity;
import com.kailu.activity_scheduler.factory.ActivityFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ActivitySchedulerApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueSchedule = true;

		do {
			System.out.println("What day is it day? If you want to exit, please type exit.");

			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("exit")){
				continueSchedule = false;
				break;
			}

			AbstractActivity activity = ActivityFactory.findAction(input);
			if (activity == null){
				System.out.println("there is no such an option.");
			}else{
				activity.doAction();
			}
		}while (continueSchedule);

		System.out.println("bye bye");
		scanner.close();
	}

}
