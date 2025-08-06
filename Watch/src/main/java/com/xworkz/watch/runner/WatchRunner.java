package com.xworkz.watch.runner;

import com.xworkz.watch.entity.WatchEntity;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {
        List<WatchEntity> watchEntityList = new ArrayList<>();
        watchEntityList.add(new WatchEntity("F-50", "Fossil", 15000));
        watchEntityList.add(new WatchEntity("Fully", "Fastrack", 1500));
        watchEntityList.add(new WatchEntity("octane", "Titan", 8000));
        watchEntityList.add(new WatchEntity("vintage", "casio", 2500));
        watchEntityList.add(new WatchEntity("SLS", "Tg", 10500));

        WatchService watchService = new WatchServiceImpl();
        watchService.save(watchEntityList);

    }
}
