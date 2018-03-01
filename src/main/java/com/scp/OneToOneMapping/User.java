package com.scp.OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class User {
	@Id
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	
	
	/*Unidirectional 3 types-
	 * 1)@OneToOne
	 *     @JoinColumn(name="V_Id")
	 * 2)@OneToOne
	 *     @JoinTable(name="USER_VEHICLE_MAP", joinColumns= @JoinColumn(name="USER_Id"),inverseJoinColumns=@JoinColumn(name="V_Id"))
	 * 3)
	 *
	 */
	@OneToOne
	 //@JoinColumn(name="V_Id")
	 //@JoinTable(name="USER_VEHICLE_MAP", joinColumns= @JoinColumn(name="USER_Id"),inverseJoinColumns=@JoinColumn(name="V_Id"))
	   @PrimaryKeyJoinColumn
	
	private Vehicle vehicle;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "\nUser [userId=" + userId + ", userName=" + userName + ", vehicle=" + vehicle + "]";
	}
	public User(int userId, String userName, Vehicle vehicle) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.vehicle = vehicle;
	}
	public User() {
		super();
		
	}

}
