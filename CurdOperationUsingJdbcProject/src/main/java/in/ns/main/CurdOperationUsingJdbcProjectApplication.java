package in.ns.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ns.main.dao.UserDao;
import in.ns.main.entity.User;

@SpringBootApplication
public class CurdOperationUsingJdbcProjectApplication implements CommandLineRunner {
	
	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationUsingJdbcProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//-------insertion-----------------------------------

//		User user1=new User("Waseem","waseem123@gmail.com","Male","Katihar");
//		boolean status =userDao.insetUser(user1);
//		if(status)
//		{
//			System.out.println("User inserted successfully.");
//		}
//		else
//		{
//			System.out.println("User not inserted due to some error.");
//		}
		
		
//		----------------------
		
		
//		User user2=new User("Amaan","amaan123@gmail.com","Female","Delhi");
//		boolean status =userDao.insetUser(user2);
//		if(status)
//		{
//			System.out.println("User inserted successfully.");
//		}
//		else
//		{
//			System.out.println("User not inserted due to some error.");
//		}
//		
//		
		//-----------------------updation-----------------
		
//		User user=new User("Minhaj","iesmenu123@gmail.com","Male","Delhi");
//		boolean status =userDao.updateUser(user);
//		if(status)
//		{
//			System.out.println("User updated successfully.");
//		}
//		else
//		{
//			System.out.println("Updation Failed.");
//		}
		
		
		
//		-----------------------
		
		
		
//		User user = userDao.getUserByEmail("amaan123@gmail.com");
//		user.setGender("Male");
//		boolean status =userDao.updateUser(user);
//		if(status)
//		{
//			System.out.println("User updated successfully.");
//		}
//		else
//		{
//			System.out.println("Updation Failed.");
//		}
		
		//----------------deletation---------------
//		
//		boolean status=userDao.deleteUserByEmail("amaan123@gmail.com");
//		if(status)
//			{
//				System.out.println("User deleted successfully.");
//			}
//			else
//			{
//				System.out.println("Deletaion Failed.");
//			}
//		
		
		
		//-------------Select one user -----------------
//		User user = userDao.getUserByEmail("iesmenu123@gmail.com");
//		System.out.println("Name : " +user.getName());
//		System.out.println("Email : " +user.getEmail());
//		System.out.println("Gender : " +user.getGender());
//		System.out.println("City : " +user.getCity());
//
//		
//		----------------select all users------------
		
		
		List<User> list = userDao.getAllUsers();
		for(User user:list)
		{
			System.out.println("Name : " +user.getName());
			System.out.println("Email : " +user.getEmail());
			System.out.println("Gender : " +user.getGender());
			System.out.println("City : " +user.getCity());
			System.out.println("-----------------");
		}
		
		
	}

}
