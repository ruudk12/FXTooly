package nl.fxtooly.model;

import com.documentum.fc.client.IDfSession;

public class Repository {
	private String name;
	private String username;
	private String password;
	private IDfSession session;

	public Repository(){

	}
	public Repository(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name + (session == null ? "" : " ("+username+")");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public IDfSession getSession() {
		return session;
	}
	public void setSession(IDfSession session) {
		this.session = session;
	}
}