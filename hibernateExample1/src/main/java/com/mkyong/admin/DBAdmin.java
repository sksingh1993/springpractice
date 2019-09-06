package com.mkyong.admin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="DBADMIN")
public class DBAdmin implements Serializable{
	private int adminId;
	private String adminName;
	private Date lastUpdated;
	public DBAdmin() {}
	public DBAdmin(int adminId, String adminName, Date lastUpdated) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.lastUpdated = lastUpdated;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ADMIN_ID", unique = true, nullable = false, precision = 5, scale = 0)
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	@Column(name = "ADMINNAME", nullable = false, length = 20)
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "LASTUPDATED", nullable = false, length = 7)
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
}
