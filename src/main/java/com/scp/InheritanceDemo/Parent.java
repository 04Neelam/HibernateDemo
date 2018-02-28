package com.scp.InheritanceDemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="PARENT_INFO")
//@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Parent {
	@Id
	//@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name="P_Id")
	private int parent_id;
	@Column(name= "P_NAME")
	private String parent_name;
	@Override
	public String toString() {
		return "\nParent [parent_id=" + parent_id + ", parent_name=" + parent_name + "]";
	}
	public Parent(int parent_id, String parent_name) {
		super();
		this.parent_id = parent_id;
		this.parent_name = parent_name;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

}

