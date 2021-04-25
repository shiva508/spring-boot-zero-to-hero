package com.pool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.model.Organization;
import com.pool.service.OrganizationService;

@RestController
public class OrganizationController {
	@Autowired
	private OrganizationService organizationService;

	@GetMapping("/organizations")
	public List<Organization> getAllOraganizations() {
		Organization organization = new Organization();
		organization.setOrganixzationName("INFINITY");
		organizationService.saveOrganization(organization);
		List<Organization> restlt = null;
		try {
			restlt = organizationService.getAllOrganizations();
		} catch (Exception e) {
			System.out.println("EXCEPTION HAS OCCURED");
		}
		return restlt;
	}
}
