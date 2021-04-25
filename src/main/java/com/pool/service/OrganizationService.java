package com.pool.service;

import java.util.List;

import com.pool.model.Organization;

public interface OrganizationService {
	public List<Organization> getAllOrganizations();

	public Organization saveOrganization(Organization organization);
}
