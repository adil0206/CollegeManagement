package com.nt.dao;

import com.nt.model.SignUp;

public interface CollegeDao {
	public int save(SignUp sUp);

	public int update(SignUp U);

	public void delete(String username);

	public SignUp get(String username);
}
