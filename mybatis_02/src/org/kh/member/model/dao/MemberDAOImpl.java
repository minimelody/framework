package org.kh.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.model.vo.Member;

public class MemberDAOImpl{

	public Member idFind(SqlSession session, String userId) {
		Member m = session.selectOne("member.test1",userId);
		return m;
	}

	public Member selectOne(SqlSession session, Member m) {
		Member m1 = session.selectOne("member.test2",m);
		return m1;
	}

	public int insertMember(SqlSession session, Member m) {
		int result = session.insert("member.test3",m);
		return result;
	}

	public Member updateMember(SqlSession session, Member m) {
		Member m2 = session.selectOne("member.test4",m);
		return m2;
	}

	public int deleteMember(SqlSession session, Member m) {
		int result = session.delete("member.test5",m);
		return result;
	}

	public ArrayList<Member> selectAllMember(SqlSession session) {
		List list = session.selectList("member.test6");
		return (ArrayList<Member>)list;
	}

	public int updateMemberTwo(SqlSession session, Member m) {
		int result = session.update("member.test7",m);
		return result;
	}
	
}
