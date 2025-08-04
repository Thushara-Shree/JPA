package com.xworkz.bag.runner;

import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.service.BagService;
import com.xworkz.bag.service.BagSeviceImpl;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Runner class");
        BagEntity bagEntity=new BagEntity(1,"Luna","plastic");
        System.out.println(bagEntity);
        BagService bagService=new BagSeviceImpl();
        bagService.Save(bagEntity);
    }
}
