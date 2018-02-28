package com.scp.InheritanceDemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHILD2_INFO")
@DiscriminatorValue("CHILD2")
class Child2 extends Parent{
	//@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name="C2_Id")
	private int child2_id;
	@Column(name= "C2_NAME")
	private String child2_name;
	public int getChild2_id() {
		return child2_id;
	}
	public void setChild2_id(int child2_id) {
		this.child2_id = child2_id;
	}
	public String getChild2_name() {
		return child2_name;
	}
	public void setChild2_name(String child2_name) {
		this.child2_name = child2_name;
	}
	@Override
	public String toString() {
		return "\nChild2extendsParent [child2_id=" + child2_id + ", child2_name=" + child2_name + "]";
	}
	
	public Child2(int parent_id, String parent_name, int child2_id, String child2_name) {
		super(parent_id, parent_name);
		this.child2_id = child2_id;
		this.child2_name = child2_name;
	}
	public Child2(int parent_id, String parent_name) {
		super(parent_id, parent_name);
		// TODO Auto-generated constructor stub
	}

}