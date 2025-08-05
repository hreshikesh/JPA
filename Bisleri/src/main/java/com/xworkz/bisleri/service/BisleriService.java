package com.xworkz.bisleri.service;

import com.xworkz.bisleri.entity.BisleriEntity;

public interface BisleriService {
    BisleriEntity save(BisleriEntity bisleri);

    BisleriEntity getBisleriEntityById(int id);

    boolean updateBisleriEntityById(int id, String location);

    void deleteById(int id);
}
