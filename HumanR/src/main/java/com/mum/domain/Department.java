/**
 * 
 */
package com.mum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Nabin
 *
 */
@Entity(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long departmentId;
	@NotEmpty (message=" departmentName cannot be empty")
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
