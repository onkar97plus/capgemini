package com.Bean;


import java.io.Serializable;

public class AccountBean implements Serializable
{
  private String insured_name;
  private String insured_street;
  private String insured_city;
  private String insured_state;
  private long insured_zip;
  private String business_segment;
  private String username;
  public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
private int account_number;
public String getInsured_name() {
	return insured_name;
}
public String getInsured_street() {
	return insured_street;
}
public String getInsured_city() {
	return insured_city;
}
public String getInsured_state() {
	return insured_state;
}
public long getInsured_zip() {
	return insured_zip;
}
public String getBusiness_segment() {
	return business_segment;
}
public int getAccount_number() {
	return account_number;
}
public void setInsured_name(String insured_name) {
	this.insured_name = insured_name;
}
public void setInsured_street(String insured_street) {
	this.insured_street = insured_street;
}
public void setInsured_city(String insured_city) {
	this.insured_city = insured_city;
}
public void setInsured_state(String insured_state) {
	this.insured_state = insured_state;
}
public void setInsured_zip(long insured_zip) {
	this.insured_zip = insured_zip;
}
public void setBusiness_segment(String business_segment) {
	this.business_segment = business_segment;
}
public void setAccount_number(int account_number) {
	this.account_number = account_number;
}

  
}