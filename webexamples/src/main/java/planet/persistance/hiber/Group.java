package planet.persistance.hiber;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "GROUPS")
public class Group {
	private long id;
	private String name;

	private Set<UserGroup> userGroups = new HashSet<UserGroup>();
	
	public Group() {
	}

	public Group(String name) {
		this.name = name;
	}
		
	@Id
	@GeneratedValue
	@Column(name = "GROUP_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "primaryKey.group",
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