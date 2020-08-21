package board;
 
import java.util.ArrayList;
import java.util.Arrays;

public class MemberManage {
	ArrayList<Article> members = new ArrayList<>();
	
	void signup(Article member) {
		members.add(member);
	}
	
	ArrayList<Article> memberData() {
		return members;
	}
}
