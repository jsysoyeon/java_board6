package board;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {
	
	MemberManage mm = new MemberManage();
	ArticleManage am = new ArticleManage();
	
	public void start() {

		ArticleManage am = new ArticleManage();
		Scanner sc = new Scanner(System.in);
		String Id;
		String Pw;
		
		while(true) {
			System.out.println("로그인 : login / 회원가입 : signup");
			
			String s = sc.nextLine();
			
			if(s.equals("signup")) {
				System.out.println("");
				System.out.println("아이디를 입력하십시오.");
				Id = sc.nextLine();
				System.out.println("비밀번호를 입력하십시오.");
				Pw = sc.nextLine();
				
				Article member = new Article();
				member.setMember(Id);
				member.setPassword(Pw);
				
				mm.signup(member);
			}
			
			else if(s.equals("login")) {

				if(check() == 1) {
					System.out.println("로그인 성공");
					am.print();
				}
				else if(check() == 0) {
					System.out.println("틀린 비밀번호입니다.");
				}
				else if(check() == -1) {
					System.out.println("틀린 아이디입니다.");
				}
			}
		}
		
	}
	
	public int check() {
		int index;
		Scanner sc = new Scanner(System.in);
		ArrayList<Article> members = mm.memberData();
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		for(int i = 0; i < members.size(); i++) {
			Article member = members.get(i);
			if(member.getMember().equals(id)) {
				if(member.getPassword().equals(pw)) {
					return index = 1;
				}
				else {
					return index = 0;
				}
			}
			if(!(member.getMember().equals(id))) {
				return index = -1;
			}
//			else {
//				return index = -1;
//			}
		}
		
		return 10;
	}

}
