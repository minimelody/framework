package org.kh.member.model.vo;

public class Search {
	private String searchRadio;
	private String searchKeyword;
	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Search(String searchRadio, String searchKeyword) {
		super();
		this.searchRadio = searchRadio;
		this.searchKeyword = searchKeyword;
	}
	public String getSearchRadio() {
		return searchRadio;
	}
	public void setSearchRadio(String searchRadio) {
		this.searchRadio = searchRadio;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
}
