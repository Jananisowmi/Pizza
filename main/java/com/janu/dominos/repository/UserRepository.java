package com.janu.dominos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.janu.dominos.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserByEmailId(String emailId);

	@Modifying
	@Query(value= "update user set a_id=?1 where user_id=?2",nativeQuery = true)
	void updateAddress(Integer aId, Integer userId);

	
	

}
