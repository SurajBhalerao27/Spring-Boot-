package com.lms.service;

import java.util.List;

import com.lms.entity.Member;

public interface MemberService {

	Member addMember();

	Member updateMember();

	void deleteMember();

	List<Member> getAllMembers();

	Member getMemberById();

}
