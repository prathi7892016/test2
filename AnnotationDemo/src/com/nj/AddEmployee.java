package com.nj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=null;
		SessionFactory factory =null ;
		try
		{
			System.out.println("in try");
		
		try
		{
			 factory = HibernateUtil.getSessionFactory();
		}
		catch(Throwable t) {
			System.out.println(t);
			t.printStackTrace();
		}
		System.out.println("Factory..");
		session=factory.openSession();
		Transaction tr=session.beginTransaction();
		//int id=Integer.parseInt(args[0]);
		//int sl=Integer.parseInt(args[2]);
		Employee emp=new Employee(1,"abc",50000);
		session.save(emp);
		tr.commit();
		System.out.println("Record Added");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("in finally");
			session.flush();
			session.close();
		}
			}

		

	}


