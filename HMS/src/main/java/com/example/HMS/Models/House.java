/**
 * 
 */
package com.example.HMS.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

/**
 * @author karth
 *
 */
// For assigning house data types and getter and setter methods
@Entity
public class House {
     
	 @Id
		
		  @SequenceGenerator(name="webuser_idwebuser_seq",
		  sequenceName="webuser_idwebuser_seq", allocationSize=1)
		/*
		 * @GeneratedValue(strategy = GenerationType.SEQUENCE,
		 * generator="webuser_idwebuser_seq")
		 */
		  
		  @Column(name = "hno")
		 
	private int hno;
	 private String model;
	 private String address;
	 private int cost;
	 private int zipcode;
	
		
		  public int getHno() { 
			  return hno; 
			  }
		 
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "House [hno=" + hno + ", model=" + model + ", address=" + address + ", cost=" + cost + ", zipcode="
				+ zipcode + "]";
	}
	
	
	
	
	
}
