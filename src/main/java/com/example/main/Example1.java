package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Spring Context Execution:" + veh1.getName());

        Vehicle veh2 = context.getBean("JeepVehicle",Vehicle.class);
        System.out.println("Spring Context Execution:" + veh2.getName());

        Vehicle veh3 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Spring Context Execution:" + veh3.getName());
    }
}
