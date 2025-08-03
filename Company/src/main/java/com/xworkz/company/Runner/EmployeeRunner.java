package com.xworkz.company.Runner;

import com.xworkz.company.Entity.CompanyEntity;
import com.xworkz.company.Entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("company");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

//        List<EmployeeEntity> employeeList = new ArrayList<>();
//
//        employeeList.add(new EmployeeEntity(1, "Ramesh Kulkarni", "IT Services", "Bengaluru", "Infosys", "Senior Developer"));
//        employeeList.add(new EmployeeEntity(2, "Anjali Nair", "Consulting", "Mumbai", "TCS", "Consultant"));
//        employeeList.add(new EmployeeEntity(3, "Sourav Roy", "R&D", "Pune", "Wipro", "Research Engineer"));
//        employeeList.add(new EmployeeEntity(4, "Priya Menon", "Cloud Services", "Hyderabad", "HCLTech", "Cloud Engineer"));
//        employeeList.add(new EmployeeEntity(5, "Vinay Shetty", "Digital Solutions", "Chennai", "Tech Mahindra", "Tech Lead"));
//        employeeList.add(new EmployeeEntity(6, "Neha Sharma", "QA", "Noida", "Capgemini", "QA Analyst"));
//        employeeList.add(new EmployeeEntity(7, "Aditya Verma", "IT Services", "Bengaluru", "IBM", "Backend Developer"));
//        employeeList.add(new EmployeeEntity(8, "Divya Joshi", "Product Team", "Gurgaon", "Cognizant", "Product Manager"));
//        employeeList.add(new EmployeeEntity(9, "Harish Babu", "Support", "Kochi", "Mindtree", "Support Engineer"));
//        employeeList.add(new EmployeeEntity(10, "Sana Khan", "UI/UX", "Mysuru", "L&T Infotech", "UI Designer"));
//
//
//        for(EmployeeEntity employeeEntity:employeeList){
//            entityManager.persist(employeeEntity);
//        }
//        entityTransaction.commit();
//        ;
        EmployeeEntity companyEntity=entityManager.find(EmployeeEntity.class,9);
        System.out.println(companyEntity);
        companyEntity.setEmployeeBranch("Blgnr");
        entityManager.merge(companyEntity);

        EmployeeEntity companyEntity1=entityManager.find(EmployeeEntity.class,1);
        EmployeeEntity companyEntity2=entityManager.find(EmployeeEntity.class,2);
        if(companyEntity1!=null){
            entityManager.remove(companyEntity1);
        }
        if(companyEntity2!=null){
            entityManager.remove(companyEntity2);
        }

        entityTransaction.commit();






    }
}
