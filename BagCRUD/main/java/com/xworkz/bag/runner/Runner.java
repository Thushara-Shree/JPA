package com.xworkz.bag.runner;

import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.service.BagService;
import com.xworkz.bag.service.BagSeviceImpl;

public class Runner {

    public static void main(String[] args) {

        System.out.println("............");
        BagEntity bagEntity = new BagEntity(1,"sky",900,5);
        BagEntity bagEntity1 = new BagEntity(2,"nike",1000,4);
        System.out.println(bagEntity1);
        BagService bagService = new BagSeviceImpl();
        bagService.save(bagEntity1);

    }
}
