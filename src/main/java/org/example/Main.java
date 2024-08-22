package org.example;


import org.example.Embedded.FullName;
import org.example.Entity.Student;
import org.example.config.FactoryConfigaration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfigaration.getInstance().getSession();

        FullName fullName = new FullName("dila","dila");

        Student student = new Student();
        student.setId(1);
        student.setFullname(fullName);
        student.setAddress("maggona");
        Transaction transaction = session.beginTransaction();

        //session.delete(student);
        //session.save(student);
        Student st = session.get(Student.class,1);
        if (st!=null){
            System.out.println(student.getId());
            System.out.println(student.getAddress());
            System.out.println(student.getFullname().getFirstName());
            System.out.println(student.getFullname().getLastName());
        }
        transaction.commit();
        session.close();
    }
}