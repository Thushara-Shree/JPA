package com.xworkz.bag.service;

import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.repository.BagRepo;
import com.xworkz.bag.repository.BagRepoImpl;

public class BagSeviceImpl implements BagService{
    @Override
    public void Save(BagEntity bagEntity) {
        BagRepo bagRepo=new BagRepoImpl();
        bagRepo.save(bagEntity);
    }
}
