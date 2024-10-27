package in.ns.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.ns.main.entity.User;
import in.ns.main.mapper.UserRowMapper;


@Repository
public class UserDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insetUser(User user)
	{
		boolean status= false;
		
		try {
			String INSERT_SQL_QUERY="INSERT INTO users (name,email,gender,city) VALUES(?,?,?,?)";
			int count=jdbcTemplate.update(INSERT_SQL_QUERY, user.getName(),user.getEmail(),user.getGender(),user.getCity());
		
			if(count>0)
			{
				status=true;
			}
			else 
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
	}
	
	
	public boolean updateUser(User user)
	{
		boolean status= false;
		
		try {
			String UPDATE_SQL_QUERY="UPDATE users SET name=?,gender=?,city=? WHERE email=?";
			int count=jdbcTemplate.update(UPDATE_SQL_QUERY, user.getName(),user.getGender(),user.getCity(),user.getEmail());
		
			if(count>0)
			{
				status=true;
			}
			else 
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
	}
	
	
	public boolean deleteUserByEmail(String email)
	{
		boolean status= false;
		
		try {
			String DELETE_SQL_QUERY="DELETE FROM users WHERE email=?";
			int count=jdbcTemplate.update(DELETE_SQL_QUERY,email);
		
			if(count>0)
			{
				status=true;
			}
			else 
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
	}
	
	
	public User getUserByEmail(String email)
	{
		String SELECT_SQL_QUERY="SELECT * FROM users WHERE email=?";
		return jdbcTemplate.queryForObject(SELECT_SQL_QUERY, new UserRowMapper(),email);
	}
	
	
	public List<User> getAllUsers()
	{
		String SELECT_SQL_QUERY="SELECT * FROM users";
		return jdbcTemplate.query(SELECT_SQL_QUERY, new UserRowMapper());
	}
	
	
	

}
