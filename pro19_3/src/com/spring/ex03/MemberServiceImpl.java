package com.spring.ex03;

public class MemberServiceImpl implements MemberService{

	MemberDAO dao;
	
	
	
	
	public MemberDAO getDao() {
		return dao;
	}




	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}




	@Override
	public void listMembers() {
		
	
		System.out.println("회원 목록 나옴");
		
		dao.listMembers();
		
	}

}
