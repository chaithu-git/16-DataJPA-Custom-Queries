package in.chaithanya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.chaithanya.entity.CustomUser;
import jakarta.transaction.Transactional;

@Repository
public interface CustomUserRepository extends CrudRepository<CustomUser, Integer>{
	
	@Query(value="from CustomUser")
	public List<CustomUser> getAllCustomUserHql();

	@Query(value="select * from Custom_User",nativeQuery = true)
    public List<CustomUser> getAllCustomUserSql();
	
	@Query(value="from CustomUser where userCountry=:userCountry")
	public List<CustomUser>  getAllCustomUserByuserCountry(String userCountry);
	
	@Query(value="from CustomUser where userCountry=:userCountry and userAge=:userAge")
	public List<CustomUser> getAllCustomUserByuserCountryAnduserAge(String userCountry,Integer userAge);
	
	 @Modifying
	 @Transactional
	 @Query(value="delete from CustomUser where userId =:userId")
	  Integer deleteByuserId(Integer userId);
	 
	 @Modifying
	 @Transactional
	 @Query(value="update  CustomUser set userName =:userName where userId=:userId")
	 Integer updateByuserName(Integer userId ,String userName);
}

