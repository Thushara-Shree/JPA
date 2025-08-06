package com.xworkz.bag.service;

import com.xworkz.bag.entity.BagEntity;

public interface BagService {

    void save(BagEntity bagEntity);

    void Save(BagEntity bagEntity);

    BagEntity getBagEntityById(int id);

    boolean updateBagEntityById(int id,String brand);

    void deleteBagEntityById(int id);
}
