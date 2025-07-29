package com.xworkz.newroom;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NewRoomRunner {

    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Room");
       if(entityManagerFactory!=null){
           System.out.println("Hello Shifted to new Room");
       }

    }

}
