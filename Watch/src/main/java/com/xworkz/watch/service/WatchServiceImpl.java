package com.xworkz.watch.service;

import com.xworkz.watch.entity.WatchEntity;
import com.xworkz.watch.repository.WatchRepository;
import com.xworkz.watch.repository.WatchRepositoryImpl;

import java.util.List;

public class WatchServiceImpl implements  WatchService{
    @Override
    public boolean save(List<WatchEntity> watchEntityList) {
        WatchRepository watchRepository=new WatchRepositoryImpl();

        watchRepository.save(watchEntityList);

        return false;
    }
}
