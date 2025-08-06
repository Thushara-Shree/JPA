package com.xworkz.motorola.runner;

import com.xworkz.motorola.entity.MotorolaEntity;
import com.xworkz.motorola.service.MotorolaService;
import com.xworkz.motorola.service.MotorolaServiceImpl;

public class Runner {

    public static void main(String[] args) {

        MotorolaEntity motorola=new MotorolaEntity("Fusion bro",35000,5000,8);
        System.out.println(motorola);
        MotorolaService motorolaService=new MotorolaServiceImpl();
        motorolaService.save(motorola);



    }
}
