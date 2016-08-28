/**
 * 
 */
package com.mum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ashok
 *
 */
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long departmentId;
	private String departmentName;
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

}
