package hibernateAnnotations;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

public class userDAO {
	Configuration configuration = new Configuration().configure();

	public void addUser(String full_name,String user_name,String password) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(RegisterBean.class).
        buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			RegisterBean user = new RegisterBean();
			user.setFullName(full_name);
			user.setUserName(user_name);
			user.setPassword(password);
			session.saveOrUpdate(user);
			transaction.commit();
			System.out.println("\n\n Details Added \n");
		}catch (HibernateException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}  finally {
			session.close();
		} 
	}

	public boolean verifyUser(String userName,String password) {
		boolean result = true;
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(RegisterBean.class).
		        buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		if(userName!=null &&
				userName!="" &&password!=null &&
				password!="")
		{
			try{
				RegisterBean user = (RegisterBean)session.get(RegisterBean.class, userName);

				transaction.commit();
				if(user.getUserName()!=null && user.getUserName().equals(userName) && user.getPassword().equals(password)){
					result = true;
				}else{
					result = false;
				}
			}catch(Exception ex){
				if(transaction!=null){
					transaction.rollback();
				}
			}
		}
		return result;
	}

	public ArrayList<CarBean> returnCars(){
		ArrayList<CarBean> list = new ArrayList<CarBean>();
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(CarBean.class).
		        buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			list = (ArrayList<CarBean>)session.createQuery("FROM CarBean").list(); 
			transaction.commit();
		}catch (HibernateException e) {
			if (transaction!=null)
				transaction.rollback();
			e.printStackTrace(); 
		} finally {
			session.close(); 
		}
		return list;
	}
}
