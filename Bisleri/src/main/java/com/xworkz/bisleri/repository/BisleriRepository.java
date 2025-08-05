package com.xworkz.bisleri.repository;

import com.xworkz.bisleri.entity.BisleriEntity;

public interface BisleriRepository {
    BisleriEntity save(BisleriEntity bisleri);

    BisleriEntity getBisleriEntityById(int id);

    boolean updateBisleriEntityById(int id,String location);

    void deleteById(int id);
}
