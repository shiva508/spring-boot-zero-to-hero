package com.pool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.Organization;
import com.pool.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationRepository repository;
	
	@Override
	@Transactional
	public List<Organization> getAllOrganizations(){
		List<Organization> result=null;
		result=repository.findAll();
		if (result.isEmpty()) {
			throw new NullPointerException("NO RECORDS");
		}
		return result;
	}
	
	@Override
	@Transactional
	public Organization saveOrganization(Organization organization) {
		return repository.save(organization);
	}

}