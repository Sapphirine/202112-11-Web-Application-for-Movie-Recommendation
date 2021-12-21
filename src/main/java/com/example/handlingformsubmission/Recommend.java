package com.example.handlingformsubmission;

public class Recommend {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		  
	
	public String[] getRecommend() {
		String[] recommend = new String[11];
		recommend[0] = this.name;
		for (int i=1; i<11; i++) {
			recommend[i] = "aaaa";
		}
		return recommend;
	}
}
