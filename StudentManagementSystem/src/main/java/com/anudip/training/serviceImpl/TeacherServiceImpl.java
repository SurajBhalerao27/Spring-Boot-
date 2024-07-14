package com.anudip.training.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.training.entity.Teacher;
import com.anudip.training.exceptions.TeacherNotFountException;
import com.anudip.training.repository.TeacherRepository;
import com.anudip.training.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository trepo;

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return trepo.save(teacher);
	}

	@Override
	public Teacher getTeacherDetails(int tid) {

		return trepo.findById(tid).orElseThrow(() -> new TeacherNotFountException("Teacher id is not correct"));
	}

	@Override
	public Teacher updateTeacherDetails(Teacher teacher, int id) {
		Teacher updateTeacher = trepo.findById(id)
				.orElseThrow(() -> new TeacherNotFountException("Teacher id is not correct"));
		updateTeacher.settName(teacher.gettName());
		updateTeacher.setTsurName(teacher.getTsurName());
		updateTeacher.settEmail(teacher.gettEmail());
		updateTeacher.settMobile(teacher.gettMobile());
		updateTeacher.setDesignation(teacher.getDesignation());

		trepo.save(updateTeacher);
		return updateTeacher;
	}

	@Override
	public void deleteTeacherDetails(int tid) {
		Teacher teacher = trepo.findById(tid)
				.orElseThrow(() -> new TeacherNotFountException("Teacher id is not correct"));
		trepo.delete(teacher);
	}
}
