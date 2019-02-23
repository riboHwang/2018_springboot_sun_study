package com.spring.dto;

/**
 * @author ribo
 *
 */
public class testDTO {
	private String nickname;
	private String hobby;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "testDTO [nickname=" + nickname + ", hobby=" + hobby + "]";
	}
	
}
