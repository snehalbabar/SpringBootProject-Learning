package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
         //noraml exeuation without DI and Spring
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Non Spring execution:" + vehicle.getName());


        //Sring Ioc Continer exeution
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Spring Context Execution:" + veh.getName());
    }
}
