package in.ns.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ns.entities.User;

public class App 
{
    public static void main( String[] args )
    {

//    User user1 = new User();
////    user1.setId(1);
//    user1.setName("Minhaj");
//    user1.setEmail("minhaj@gmail.com");
//    user1.setPassword("Minhaj123");
//    user1.setGender("male");
//    user1.setCity("Delhi");
//    
//    User user2 = new User();
//    user2.setName("Usmani");
//    user2.setEmail("usmani@gmail.com");
//    user2.setPassword("Usmani123");
//    user2.setGender("female");
//    user2.setCity("Bihar");
    	
    	
    Configuration cfg = new Configuration();
    
    cfg.configure("/in/ns/config/hibernate.cfg.xml");
    
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    
    Session session = sessionFactory.openSession();
    
    Transaction transaction =session.beginTransaction();
    
    //----------------insert operation-------------
    
//    try {
//    	session.save(user2);
//        transaction.commit();
//        
//        System.out.println("User details added Successfully.");
//    	
//    }
//    catch(Exception e)
//    {
//    	transaction.rollback();
//    	e.printStackTrace();
//    	
//    	System.out.println("User details not added due to some error.");
//    }
    
    
    //-------------------select operation----------
    
//    try {
//    	
//    	User user = session.get(User.class,3L);
//    	
//    	if(user != null)
//    	{
//    		System.out.println(user.getId());
//        	System.out.println(user.getName());
//        	System.out.println(user.getEmail());
//        	System.out.println(user.getPassword());
//        	System.out.println(user.getGender());
//        	System.out.println(user.getCity());
//    	}
//    	else 
//    	{
//    		System.out.println("User not found.");
//    	}
//
//    }
//    catch( Exception e)
//    {
//    	e.printStackTrace();
//    	
//    }
    
    
    //----------updation operation---------
//    User user2 = session.get(User.class,5L);
//    user2.setGender("Male");
//    
//	try {
//		session.saveOrUpdate(user2);
//		transaction.commit();
//
//		System.out.println("User details Updated Successfully.");
//
//	} catch (Exception e) {
//		transaction.rollback();
//		e.printStackTrace();
//
//		System.out.println("User details not Updated due to some error.");
//	}
    
    
    //----------delete operation-------------
    
    
    
	try {
		
		User user2 = new User();
		user2.setId(3L);
		
		session.delete(user2);
		transaction.commit();

		System.out.println("User deleted Successfully.");

	} catch (Exception e) {
		transaction.rollback();
		e.printStackTrace();

		System.out.println("User deleted not  due to some error.");
	}
    
    
    
    }
}
