package com.example.demo.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="register page")

public class RegisterModel {
	
@Id

@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column
private String name ;

@Column
private String email ;


@Column
private String birth ;
 
@Column
private String gender ;

@Column
private String fathername ;


@Column
private String address ;

@Column
private String district ;

@Column
private String occupation ;


@Column
private String rationpic ;

@Column
private String aadhaarpic ;

@Column
private String selfphoto ;

@Column
private String paymentphoto ;

@Column
private String phoneno ;

@Column
private String proofid ;

@Column
private String occupationdetails ;

@Column
private String memberid;

@Column
private String state ;

@Column
private String member1 ;

@Column
private String village ;

@Column
private String pincode ;

@Column
private String member2 ;

@Column
private String member3; 

@Column
private String communationAddress ;

@Column
private String paymentDetails ;


public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getProofid() {
	return proofid;
}

public void setProofid(String proofid) {
	this.proofid = proofid;
}

public String getOccupationdetails() {
	return occupationdetails;
}

public void setOccupationdetails(String occupationdetails) {
	this.occupationdetails = occupationdetails;
}

public String getMemberid() {
	return memberid;
}

public void setMemberid(String memberid) {
	this.memberid = memberid;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getMember1() {
	return member1;
}

public void setMember1(String member1) {
	this.member1 = member1;
}

public String getVillage() {
	return village;
}

public void setVillage(String village) {
	this.village = village;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getMember2() {
	return member2;
}

public void setMember2(String member2) {
	this.member2 = member2;
}

public String getMember3() {
	return member3;
}

public void setMember3(String member3) {
	this.member3 = member3;
}

public String getCommunationAddress() {
	return communationAddress;
}

public void setCommunationAddress(String communationAddress) {
	this.communationAddress = communationAddress;
}

public String getPaymentDetails() {
	return paymentDetails;
}

public void setPaymentDetails(String paymentDetails) {
	this.paymentDetails = paymentDetails;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getBirth() {
	return birth;
}

public void setBirth(String birth) {
	this.birth = birth;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getFathername() {
	return fathername;
}

public void setFathername(String fathername) {
	this.fathername = fathername;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public String getOccupation() {
	return occupation;
}

public void setOccupation(String occupation) {
	this.occupation = occupation;
}

public String getRationpic() {
	return rationpic;
}

public void setRationpic(String rationpic) {
	this.rationpic = rationpic;
}

public String getAadhaarpic() {
	return aadhaarpic;
}

public void setAadhaarpic(String aadhaarpic) {
	this.aadhaarpic = aadhaarpic;
}

public String getSelfphoto() {
	return selfphoto;
}

public void setSelfphoto(String selfphoto) {
	this.selfphoto = selfphoto;
}

public String getPaymentphoto() {
	return paymentphoto;
}

public void setPaymentphoto(String paymentphoto) {
	this.paymentphoto = paymentphoto;
}

			

}