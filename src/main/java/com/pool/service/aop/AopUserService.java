package com.pool.service.aop;

import java.util.List;

import com.pool.model.aop.AopUser;

public interface AopUserService {
	public AopUser save(AopUser aopUser);

	public AopUser getAopUserByUserId(Integer userId);

	public List<AopUser> getAllAopUsers();
}
