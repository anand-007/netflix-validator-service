package application.dao;

import org.springframework.stereotype.Component;

import application.data.MockData;
import application.models.Member;

/**
 * Member DAO will retrieve the Member data. Inproduction the inmemory data will be replaced
 * @author ecom-anandraj.t
 *
 */

@Component
public class MemberDAO {

	public Member findMemberById(String id){
		
		Member mValue = MockData.getMemberDataById(id);
		return mValue;
		
	}
	
}
