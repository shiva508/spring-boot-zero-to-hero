package com.pool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table
public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer organizationId;
	@NotBlank
	@NotEmpty
	private String organixzationName;
	
	public Organization() {
	}
	public Integer getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganixzationName() {
		return organixzationName;
	}
	public void setOrganixzationName(String organixzationName) {
		this.organixzationName = organixzationName;
	}
	@Override
	public String toString() {
		return "Organization [organizationId=" + organizationId + ", organixzationName=" + organixzationName + "]";
	}
}
