package board;
 
public class Article {
	
	private int id;
	private String title;
	private String body;
	private String member;
	private String password;
	
	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return this.id;
	}
 
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public String getBody() {
		return body;
	}
 
	public void setBody(String body) {
		this.body = body;
	}
	
}