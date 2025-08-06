package com.xworkz.motorola.service;

import com.xworkz.motorola.entity.MotorolaEntity;
import com.xworkz.motorola.repository.MotorolaRepo;
import com.xworkz.motorola.repository.MotorolaRepoImpl;

public class MotorolaServiceImpl implements MotorolaService{


    @Override
    public boolean save(MotorolaEntity motorola) {
        MotorolaRepo motorolaRepo=new MotorolaRepoImpl();
        motorolaRepo.save(motorola);
        return false;
    }
}
