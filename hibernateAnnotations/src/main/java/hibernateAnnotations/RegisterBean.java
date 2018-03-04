package hibernateAnnotations;

import javax.persistence.*;

@Entity
@Table(name="users")
public class RegisterBean {
@Column(name="full_name")	
String fullName = null;
@Id @Column(name="user_name")
String userName;
@Column(name="password")
String password;
public RegisterBean() {
	
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
