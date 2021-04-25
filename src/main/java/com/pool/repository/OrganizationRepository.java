package com.pool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pool.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}
