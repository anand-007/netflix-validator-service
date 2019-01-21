package application.services;

import org.springframework.stereotype.Service;

import application.dao.MemberDAO;
import application.models.Member;

@Service
public class MemberService {
	
	MemberDAO dao;
	
	MemberService(MemberDAO memberDAO){
		this.dao = memberDAO;
	}
	
	Member findMemberById(String id){
		
		Member member = null;
		
		return member;
	}

}
