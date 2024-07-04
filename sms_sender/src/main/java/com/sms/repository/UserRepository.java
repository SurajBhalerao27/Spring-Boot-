package com.sms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sms.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
