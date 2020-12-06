package com.evolution.classes;

public class UsuariWeb extends Client {
	private String userName;
	private String password;
	
	
	public UsuariWeb(long id, String nif, String nom, String llinatges, String email, String telefon, String userName, String password) {
		super(id, nif, nom, llinatges, email, telefon);
		this.userName = userName;
		this.password = password;
	}
	
	public UsuariWeb(Client cli, String userName, String password) {
		super(cli.getId(), cli.getNif(), cli.getNom(), cli.getLlinatges(), cli.getEmail(), cli.getTelefon());
		this.userName = userName;
		this.password = password;
	}

	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
