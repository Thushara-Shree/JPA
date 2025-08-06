package com.xworkz.bag.service;

import com.xworkz.bag.entity.BagEntity;
import com.xworkz.bag.repository.BagRepo;
import com.xworkz.bag.repository.BagRepoImpl;

public class BagSeviceImpl implements BagService{

    @Override
    public void save(BagEntity bagEntity) {
        System.out.println(bagEntity);
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.save(bagEntity);
    }

    @Override
    public void Save(BagEntity bagEntity) {

    }

    @Override
    public BagEntity getBagEntityById(int id) {
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.getBagEntityById(id);
        return null;
    }

    @Override
    public boolean updateBagEntityById(int id, String brand) {
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.updateBagEntityById(id,brand);
        return false;
    }

    @Override
    public void deleteBagEntityById(int id) {
        BagRepo bagRepo = new BagRepoImpl();
        bagRepo.deleteBagEntityById(id);

    }
    }

