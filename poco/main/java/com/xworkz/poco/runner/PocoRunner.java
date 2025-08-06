package com.xworkz.poco.runner;

import com.xworkz.poco.entity.PocoEntity;
import com.xworkz.poco.service.PocoService;
import com.xworkz.poco.service.PocoServiceImpl;

public class PocoRunner {

    public static void main(String[] args) {

        PocoEntity pocoEntity=new PocoEntity("Poco",16000,5000,8);
        System.out.println(pocoEntity);
        PocoService pocoService=new PocoServiceImpl();
        pocoService.save(pocoEntity);
    }
}
