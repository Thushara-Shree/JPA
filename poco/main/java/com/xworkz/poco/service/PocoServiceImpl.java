package com.xworkz.poco.service;

import com.xworkz.poco.entity.PocoEntity;
import com.xworkz.poco.repository.PocoRepo;
import com.xworkz.poco.repository.PocoRepoImpl;

public class PocoServiceImpl implements PocoService{
    @Override
    public boolean save(PocoEntity pocoEntity) {

        PocoRepo pocoRepo=new PocoRepoImpl();
        pocoRepo.save(pocoEntity);


        return false;
    }
}
