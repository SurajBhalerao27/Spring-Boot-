package com.anudip.sb.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TrainersInfo")
public class Teacher {
	@Id
	private int tid;
	@Column(length = 25, nullable = false)
	private String tname;

	@Column(length = 25, nullable = false)
	private String tsurname;

	@Column(length = 20, nullable = false, unique = true)
	private String temail;

	@Column(length = 11, nullable = false, unique = true)
	private long tphone;

	@Column(length = 25, nullable = false)
	private String designation;

	@OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Batches> batchDetails;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "deptID", referencedColumnName = "did")
	@JsonBackReference
	private Department department;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsurname() {
		return tsurname;
	}

	public void setTsurname(String tsurname) {
		this.tsurname = tsurname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public long getTphone() {
		return tphone;
	}

	public void setTphone(long tphone) {
		this.tphone = tphone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Batches> getBatchDetails() {
		return batchDetails;
	}

	public void setBatchDetails(List<Batches> batchDetails) {
		this.batchDetails = batchDetails;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
