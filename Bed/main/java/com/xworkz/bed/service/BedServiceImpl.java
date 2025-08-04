package com.xworkz.bed.service;

import com.xworkz.bed.entity.BedEntity;
import com.xworkz.bed.repository.BedRepo;
import com.xworkz.bed.repository.BedRepoImpl;

public class BedServiceImpl implements BedService{

    @Override
    public void Save(BedEntity bedEntity) {
        BedRepo bedRepo=new BedRepoImpl();
        bedRepo.save(bedEntity);
    }
}
