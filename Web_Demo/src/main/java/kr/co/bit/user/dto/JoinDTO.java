package kr.co.bit.user.dto;

public class JoinDTO {
	private String userid;
	private String userpw;
	private String username;
	private String email;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
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
	@Override
	public String toString() {
		return "JoinDTO [userid=" + userid + ", userpw=" + userpw + ", username=" + username + ", email=" + email + "]";
	}
	
	
	

}
