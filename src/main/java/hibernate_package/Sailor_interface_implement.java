package hibernate_package;
//importing required packages
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Sailor_interface_implement implements Sailor_interface {
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.config.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory sfactory=meta.buildSessionFactory();

	//insertion
	@Override
	public void insertSailor(Sailors s) {
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(s);
		transaction.commit();
		
	}
    //updation
	@Override
	public void updateSailor(Sailors s) {
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
	    session.save(s);
		transaction.commit();
		
	}

	//selecting the values
	@Override
	public void selectSailors() {
		Session session = sfactory.openSession();
		Query q = session.createQuery("from Sailors");
		List<Sailors> list = q.getResultList();
		Iterator<Sailors> i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//fetching names from Sailors
		Query q1 = session.createQuery("select sname from Sailors");
		List<Sailors> names = q1.getResultList();
		Iterator<Sailors> itr = names.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//count of names
		Query q2 = session.createQuery("select count(sname) from Sailors");
		List<Integer> count = q1.getResultList();
		Iterator<Integer> itr1 = count.iterator();
			System.out.println("Records updated"+count);
			
			//max function
		Query q3 = session.createQuery("select max(age) from Sailors");
		List<Integer> a = q3.getResultList();
		Iterator<Integer> itr2 = a.iterator();
		System.out.println("Maximum age of sailors is "+a);
		
		//min function
		Query q4 = session.createQuery("select min(age) from Sailors");
		List<Integer> b = q4.getResultList();
		Iterator<Integer> itr3 = b.iterator();
		System.out.println("Minimum age of sailors is "+b);
		
		//average function
		Query q5 = session.createQuery("select avg(age) from Sailors");
		List<Integer> c = q5.getResultList();
		Iterator<Integer> itr4 = c.iterator();
		System.out.println("Average age of sailors is "+c);
	}
	
	//deletion
	@Override
	public void deleteSailor(Sailors s) {
		Session session = sfactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(s);
		transaction.commit();
		
	}


}
