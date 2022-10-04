package com.svv.junittest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.svv.junittest.model.UserName;

@Repository
public interface UserRepository extends JpaRepository<UserName,Long>{
	
	UserName findByuser(String user);


}
