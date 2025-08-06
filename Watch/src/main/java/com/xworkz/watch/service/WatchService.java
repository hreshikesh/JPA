package com.xworkz.watch.service;

import com.xworkz.watch.entity.WatchEntity;

import java.util.List;

public interface WatchService {
    boolean save(List<WatchEntity> watchEntityList);
}
