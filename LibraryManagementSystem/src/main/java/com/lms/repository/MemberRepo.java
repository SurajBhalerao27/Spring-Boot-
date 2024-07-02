package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.Member;

public interface MemberRepo extends JpaRepository<Member, Integer> {

}
