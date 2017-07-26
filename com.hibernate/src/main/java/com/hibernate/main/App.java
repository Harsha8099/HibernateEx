package com.hibernate.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.hibernate.persistance.HibernateUtil;
import com.hibernate.pojo.Employee;

public class App {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Employee emp = new Employee();

		emp.setId(1);
		emp.setName("harsha");
		emp.setPassword("harsha");

		// session.save(emp);
		session.getTransaction().commit();

		List employees = session.createQuery("From Employee").list();
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.print("EmpId: " + employee.getId());
			System.out.print("  Name: " + employee.getName());
			System.out.println("  Password: " + employee.getPassword());
		}
	}

}
