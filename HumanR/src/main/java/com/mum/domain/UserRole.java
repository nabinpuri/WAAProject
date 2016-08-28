package com.mum.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 
 * @author NiDiNA
 *
 */
@Entity
public class UserRole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long roleId;
	private String roleName;

	// generate getters and setters
	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
