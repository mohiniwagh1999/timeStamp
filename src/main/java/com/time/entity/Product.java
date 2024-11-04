package com.time.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)//support mysql
	//auto-increment
	private String pid;
	@Column(name="pname")
	private String name;
	private Double price;
	
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate createdDate;
	
	@Column(insertable=false)
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}

	
	
}
