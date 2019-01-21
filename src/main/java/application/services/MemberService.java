package application.services;

import org.springframework.stereotype.Service;

import application.dao.MemberDAO;
import application.models.Member;

/**
 * 
 * @author ecom-anandraj.t
 *
 */

@Service
public class MemberService {
	
	MemberDAO dao;
	
	MemberService(MemberDAO memberDAO){
		this.dao = memberDAO;
	}
	
	Member findMemberById(String id){
		
		Member member = null;
		
		member = this.dao.findMemberById(id);
		
		return member;
	}

}
