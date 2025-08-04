package com.xworkz.bed.runner;

import com.xworkz.bed.entity.BedEntity;
import com.xworkz.bed.service.BedService;
import com.xworkz.bed.service.BedServiceImpl;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Runner class");

        BedEntity bedEntity=new BedEntity(1,"Harry","Kadri");
        System.out.println(bedEntity);
        BedService bedService=new BedServiceImpl();
        bedService.Save(bedEntity);
    }
}
