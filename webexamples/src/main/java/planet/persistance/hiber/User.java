package planet.persistance.hiber;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USERS_TEST")
public class User {
	private long id;
	private String username;
	private String password;
	private String email;	

	private Set<UserGroup> userGroups = new HashSet<UserGroup>();

	public User() {
	}

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public void addGroup(UserGroup group) {
		this.userGroups.add(group);
	}

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(mappedBy = "primaryKey.user", 
			cascade = CascadeType.ALL)
	public Set<UserGroup> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(Set<UserGroup> groups) {
		this.userGroups = groups;
	}
	
	public void addUserGroup(UserGroup userGroup) {
		this.userGroups.add(userGroup);
	}	
}