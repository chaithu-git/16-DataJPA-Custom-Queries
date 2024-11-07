package in.chaithanya;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.entity.CustomUser;
import in.chaithanya.repository.CustomUserRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		CustomUserRepository repository=context.getBean(CustomUserRepository.class);
		
		/*
		 * CustomUser users=new CustomUser(); users.setUserId(104);
		 * users.setUserName("Dakshith"); users.setUsergender("male");
		 * users.setUserAge(28); users.setUserCountry("UK"); repository.save(users);
		 */
		
		/*
		 * List<CustomUser> users1=repository.getAllCustomUserHql();
		 * users1.forEach(users->{ 
		 * System.out.println(users); });
		 */
		
//		List<CustomUser> users1=repository.getAllCustomUserSql();
//		users1.forEach(users->{
//			System.out.println(users);
//		});
		
		//List<CustomUser> users1=repository.getAllCustomUserByuserCountry("India");
		
//		List<CustomUser> users1=repository.getAllCustomUserByuserCountryAnduserAge("india", 25);
//	    users1.forEach(users->{
//		System.out.println(users);
//		});
			
//		repository.deleteByuserId(100);
//		System.out.println(repository);
	    
		repository.updateByuserName(101,"bhuvana");
		System.out.println(repository);
	    
		
		}

	}		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				
				
			
