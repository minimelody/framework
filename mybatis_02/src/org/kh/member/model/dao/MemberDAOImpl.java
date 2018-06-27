package org.kh.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.model.vo.Member;

public class MemberDAOImpl{

	public Member idFind(SqlSession session, String userId) {
		Member m = session.selectOne("member.test1",userId);
		return m;
	}

	public Member selectOne(SqlSession session, Member m) {
		Member m = session.selectOne("member.test2",m);
		return m;
	}
	
}
