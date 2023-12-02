package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ProjectConfig {

    @Primary
    @Bean(name="audiVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(value = "JeepVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Jeep");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }


}
