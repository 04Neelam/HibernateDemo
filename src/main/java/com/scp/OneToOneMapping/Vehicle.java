package com.scp.OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class Vehicle {
	@Id
	@Column(name="V_Id")
	private int vehicleId;
	@Column(name="V_NAME")
	private String VehicleName;
	@OneToOne
	private User User;
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	@Override
	public String toString() {
		return "\nVehicle [vehicleId=" + vehicleId + ", VehicleName=" + VehicleName + "]";
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public Vehicle(int vehicleId, String vehicleName) {
		super();
		this.vehicleId = vehicleId;
		VehicleName = vehicleName;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public Vehicle(int vehicleId, String vehicleName, com.scp.OneToOneMapping.User user) {
		super();
		this.vehicleId = vehicleId;
		VehicleName = vehicleName;
		User = user;
	}
	public Vehicle() {
		super();
		
	}
	
	
	

}
