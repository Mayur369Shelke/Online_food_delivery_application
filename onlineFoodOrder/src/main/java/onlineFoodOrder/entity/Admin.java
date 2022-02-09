package onlineFoodOrder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "admin_id")
private Long adminId;

@Column(name = "admin_name")
private String adminName;

@Column(name = "admin_password")
private String adminPassword;

public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(String adminName, String adminPassword) {
	super();
	this.adminName = adminName;
	this.adminPassword = adminPassword;
}

public Long getAdminId() {
	return adminId;
}

public void setAdminId(Long adminId) {
	this.adminId = adminId;
}

public String getAdminName() {
	return adminName;
}

public void setAdminName(String adminName) {
	this.adminName = adminName;
}

public String getAdminPassword() {
	return adminPassword;
}

public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}


 
}

