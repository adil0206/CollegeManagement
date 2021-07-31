package com.nt.model;

public class SignUp {
	private String name;
	private String username;
	private String email;
	private String phoneno;
	private String gender;

	public SignUp(String name, String username, String email, String phoneno, String gender) {
		this.name = name;
		this.username = username;
		this.email = email;
		this.phoneno = phoneno;
		this.gender = gender;
	}
	public SignUp() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "SignUp [name=" + name + ", username=" + username + ", email=" + email + ", phoneno=" + phoneno
				+ ", gender=" + gender + "]";
	}

}
