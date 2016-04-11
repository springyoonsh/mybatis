package com.example.model;

public class Board 
{
	private int idx;
	private String userId;
	private String userPw;
	
	public Board(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	public Board(int idx, String userId, String userPw) {
		this.idx = idx;
		this.userId = userId;
		this.userPw = userPw;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}	
	

	
	
}
