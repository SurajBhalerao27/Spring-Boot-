package com.anudip.training.service;

import com.anudip.training.entity.Teacher;

public interface TeacherService {
	Teacher addTeacher(Teacher teacher);

	Teacher getTeacherDetails(int id);

	Teacher updateTeacherDetails(Teacher teacher, int id);

	void deleteTeacherDetails(int tid);

//	getAllTeachers();
//
//	getTeacherByPhone();
//
//	getTeacherByName();
//
//	getTeacherByDesignation();
}
