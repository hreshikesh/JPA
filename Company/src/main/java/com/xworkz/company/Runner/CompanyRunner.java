package com.xworkz.company.Runner;

import com.xworkz.company.Entity.CompanyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CompanyRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("company");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        List<CompanyEntity> companyList = new ArrayList<>();

        companyList.add(new CompanyEntity(1, "Tata Consultancy Services", 1700000, "K. Krithivasan", 250, "Mumbai"));
        companyList.add(new CompanyEntity(2, "Infosys", 1370000, "Salil Parekh", 190, "Bengaluru"));
        companyList.add(new CompanyEntity(3, "Wipro", 970000, "Thierry Delaporte", 180, "Bengaluru"));
        companyList.add(new CompanyEntity(4, "HCLTech", 1200000, "C Vijayakumar", 140, "Noida"));
        companyList.add(new CompanyEntity(5, "Tech Mahindra", 850000, "CP Gurnani", 130, "Pune"));
        companyList.add(new CompanyEntity(6, "Mindtree", 620000, "Debashis Chatterjee", 80, "Bengaluru"));
        companyList.add(new CompanyEntity(7, "L&T Infotech", 770000, "Nachiket Deshpande", 110, "Mumbai"));
        companyList.add(new CompanyEntity(8, "Capgemini India", 1500000, "Ashwin Yardi", 160, "Mumbai"));
        companyList.add(new CompanyEntity(9, "IBM India", 1300000, "Sandip Patel", 200, "Bengaluru"));
        companyList.add(new CompanyEntity(10, "Cognizant", 1100000, "Ravi Kumar S", 170, "Chennai"));

        for(CompanyEntity companyEntity:companyList){
            entityManager.persist(companyEntity);
        }
        entityTransaction.commit();
;
        CompanyEntity companyEntity=entityManager.find(CompanyEntity.class,4);
        System.out.println(companyEntity);




    }
}
