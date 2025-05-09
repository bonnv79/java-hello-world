package stackjava.com.springioc.applicationcontext;

public class DataResource {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public void printConnection() {
		System.out.println("driverClassName: " + this.driverClassName + "\n" + "url: " + this.url + "\n" + "username/password: " + this.username + "/" + this.password);
	}
}
