package com.scp.InheritanceDemo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" CHILD1_INFO")
@DiscriminatorValue("Child1")
class Child1 extends Parent{
	//@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name="C1_Id")
	private int child1_id;
	@Column(name= "C1_NAME")
	private String child1_name;
	public int getChild1_id() {
		return child1_id;
	}
	public void setChild1_id(int child1_id) {
		this.child1_id = child1_id;
	}
	public String getChild1_name() {
		return child1_name;
	}
	public void setChild1_name(String child1_name) {
		this.child1_name = child1_name;
	}
	public Child1(int parent_id, String parent_name, int child1_id, String child1_name) {
		super(parent_id, parent_name);
		this.child1_id = child1_id;
		this.child1_name = child1_name;
	}
	public Child1(int parent_id, String parent_name) {
		super(parent_id, parent_name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Child1 [child1_id=" + child1_id + ", child1_name=" + child1_name + "]";
	}
}