package com.xworkz.bucket.repository;

import com.xworkz.bucket.entity.BucketEntity;

public interface BucketRepo {

    void save(BucketEntity bucketEntity);

    BucketEntity getBucketEntityById(int id);

    boolean uodateBucketEntityById(int id,String material);

    void deleteBucketEntityById(int id);
}
