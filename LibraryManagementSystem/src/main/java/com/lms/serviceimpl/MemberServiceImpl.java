package com.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lms.entity.Member;
import com.lms.repository.MemberRepo;
import com.lms.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepo memberrepo;

	@Override
	public Member addMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member updateMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberById() {
		// TODO Auto-generated method stub
		return null;
	}

}
