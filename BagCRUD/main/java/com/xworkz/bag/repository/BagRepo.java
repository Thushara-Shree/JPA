package com.xworkz.bag.repository;

import com.xworkz.bag.entity.BagEntity;

public interface BagRepo {

    void save(BagEntity bagEntity);

    BagEntity getBagEntityById(int id);

    boolean updateBagEntityById(int id,String brand);

    void deleteBagEntityById(int id);
}
