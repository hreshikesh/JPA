package com.xworkz.watch.repository;

import com.xworkz.watch.entity.WatchEntity;

import java.util.List;

public interface WatchRepository {

    boolean save(List<WatchEntity> list);
}
