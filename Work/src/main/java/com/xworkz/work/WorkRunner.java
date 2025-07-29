package com.xworkz.work;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class WorkRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Work");
       if(entityManagerFactory!=null){
           System.out.println("Iam in Room");
       }

    }
}
