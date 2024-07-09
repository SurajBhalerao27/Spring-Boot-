package com.anudip.sb.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Department {
	@Id
	private int did;

	@Column(length = 20, nullable = true)
	private String deptName;

	@Column(length = 20)
	private String deptHOD;

	@Column(length = 40, nullable = true)
	private int onOfEmpl;

	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	List<Teacher> teacherList;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptHOD() {
		return deptHOD;
	}

	public void setDeptHOD(String deptHOD) {
		this.deptHOD = deptHOD;
	}

	public int getOnOfEmpl() {
		return onOfEmpl;
	}

	public void setOnOfEmpl(int onOfEmpl) {
		this.onOfEmpl = onOfEmpl;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}
	
	
}
