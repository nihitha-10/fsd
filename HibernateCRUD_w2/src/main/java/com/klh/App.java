package com.klh;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // CREATE
        Session session = HiberanateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student s1 = new Student(101, "Ram", "CSE");
        session.save(s1);
        tx.commit();
        session.close();
        System.out.println("Student Inserted");
        // READ
        session = HiberanateUtil.getSessionFactory().openSession();
        Student s = session.get(Student.class, 101);
        System.out.println(s.getName() + " " + s.getDept());
        session.close();
        // UPDATE
        session = HiberanateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        s.setDept("AI & DS");
        session.update(s);
        tx.commit();
        session.close();
        System.out.println("Student Updated");
       /* // DELETE
        session = HiberanateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        session.delete(s);
        tx.commit();
        session.close();
        System.out.println("Student Deleted");*/


	}

}
