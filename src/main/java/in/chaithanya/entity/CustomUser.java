package in.chaithanya.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Custom_USER")
public class CustomUser {
	
	@Id
	@Column(name="CUSER_ID")
	private Integer userId;
	
	@Column(name="CUSER_NAME")
	private String userName;
	
	@Column(name="CUSER_AGE")
	private Integer userAge;
	
	@Column(name="CUSER_GENDER")
	private String usergender;
	
	@Column(name="CUSER_COUNTRY")
	private String userCountry;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	@Override
	public String toString() {
		return "CustomUser [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", usergender="
				+ usergender + ", userCountry=" + userCountry + "]";
	}

	


}
