package in.ns.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ns.main.beans.Student;

@Configuration
public class AppConfig {
	
	
	@Bean
	public CommandLineRunner cmdLineRunner()
	{
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				
				stdBean1().displayStudentDetails();
				
				System.out.println("---------------");
				
				stdBean2().displayStudentDetails();
				
			}
		};
	}
	
	
	@Bean
	public Student stdBean1()
	{
		return new Student("Minhaj",101,99.5f);
	}
	
	@Bean
	public Student stdBean2()
	{
		return new Student("Amaan",102,80.0f);
	}

}
