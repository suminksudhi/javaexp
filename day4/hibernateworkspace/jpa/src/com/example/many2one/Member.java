package com.example.many2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "member_detail")
public class Member {

	int memNo;
	String name;
	String phone;
	Club club;

	public Member() {
	}

	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Member(int memNo, String name, String phone) {
		this.memNo = memNo;
		this.name = name;
		this.phone = phone;
	}

	@Id
	@Column(name = "mem_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	@Column(length = 20, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 10, nullable = true)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="c_id")
	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	

}
