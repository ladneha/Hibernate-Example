package hibernate1;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class CustomerDImpl implements CustomerD {

	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	static {
		System.out.println("Loading Hibernate configuration!");
		configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		System.out.println("Hibernate loaded successfully!!");
	}
	@Override
	public boolean saveCustomer(Customer customer) {
		Session session = null;
	try {
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Serializable id = session.save(customer);
		transaction.commit();
		System.out.println("Customer Object Persisted: "+id);
	}catch(HibernateException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(session != null) {
				session.close();
			}
		}catch(HibernateException e) {
			e.printStackTrace();
		}
	}
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeCustomer(Customer customer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(customer);
			transaction.commit();
			System.out.println("Customer Object Removed ");
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				e.printStackTrace();
			}
		}
			// TODO Auto-generated method stub
			return false;
	}

	@Override
	public boolean updateCustomer(final Customer customer) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(customer);
			transaction.commit();
			System.out.println("Customer Object Updated: ");
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				e.printStackTrace();
			}
		}
			return false;
	}

	@Override
	public Customer getCustomer(int customerId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Customer customer = (Customer) session.load(Customer.class, customerId);
			System.out.println("********************************************");
			System.out.println("The customer id you are looking for :");
			System.out.println(customer);
			System.out.println("********************************************");
		}catch(HibernateException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
