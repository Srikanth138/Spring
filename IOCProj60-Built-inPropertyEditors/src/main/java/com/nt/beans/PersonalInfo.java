package com.nt.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

public class PersonalInfo {
	private  String name;
	private  float  age;
	private  int luckyNumber;
	private  Date   doj;
	private  String[] moles;
	private  byte[]  academicPercentages;
	private  long adhaarNo;
	private  char  favChar;
	private  File   fileLocation;
	private Locale   favLocale;
	private  URL     fbUrl;
	private  Class   favClass;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public int getLuckyNumber() {
		return luckyNumber;
	}
	public void setLuckyNumber(int luckyNumber) {
		this.luckyNumber = luckyNumber;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String[] getMoles() {
		return moles;
	}
	public void setMoles(String[] moles) {
		this.moles = moles;
	}
	public byte[] getAcademicPercentages() {
		return academicPercentages;
	}
	public void setAcademicPercentages(byte[] academicPercentages) {
		this.academicPercentages = academicPercentages;
	}
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public char getFavChar() {
		return favChar;
	}
	public void setFavChar(char favChar) {
		this.favChar = favChar;
	}
	public File getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(File fileLocation) {
		this.fileLocation = fileLocation;
	}
	public Locale getFavLocale() {
		return favLocale;
	}
	public void setFavLocale(Locale favLocale) {
		this.favLocale = favLocale;
	}
	public URL getFbUrl() {
		return fbUrl;
	}
	public void setFbUrl(URL fbUrl) {
		this.fbUrl = fbUrl;
	}
	public Class getFavClass() {
		return favClass;
	}
	public void setFavClass(Class favClass) {
		this.favClass = favClass;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", age=" + age + ", luckyNumber="
				+ luckyNumber + ", doj=" + doj + ", moles="
				+ Arrays.toString(moles) + ", academicPercentages="
				+ Arrays.toString(academicPercentages) + ", adhaarNo="
				+ adhaarNo + ", favChar=" + favChar + ", fileLocation="
				+ fileLocation + ", favLocale=" + favLocale + ", fbUrl=" + fbUrl
				+ ", favClass=" + favClass + ", props=" + props + "]";
	}

}
