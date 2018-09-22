package com.ed2.buscador.api.dtos;

public class QueryDto {
	private String query;
	private int local;
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public int getLocal() {
		return local;
	}
	public void setLocal(int local) {
		this.local = local;
	}
	
}
