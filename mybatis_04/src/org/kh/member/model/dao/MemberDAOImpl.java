package org.kh.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.member.model.vo.Check;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;


public class MemberDAOImpl {

	public Member login(SqlSession session, Member m) {
		Member m1 = session.selectOne("member.login",m);
		return m1;
	}

	public int enroll(SqlSession session, Member m) {
		int result = session.insert("member.enroll",m);
		return result;
	}

	public int update(SqlSession session, Member m) {
		int result = session.update("member.update",m);
		return result;
	}

	public int delete(SqlSession session, String memberId) {
		int result = session.delete("member.delete",memberId);
		return result;
	}

	public ArrayList<Member> allMember(SqlSession session) {
		List list = session.selectList("member.allMember");
		return (ArrayList<Member>)list;
	}

	public Member oneMember(SqlSession session, String memberId) {
		Member m = session.selectOne("member.oneMember",memberId);
		return m;
	}

	public ArrayList<Member> searchMemberList(SqlSession session, Search search) {
		List list = session.selectList("member.searchList",search);
		return (ArrayList<Member>)list;
	}

	public ArrayList<Member> searchMemberList(SqlSession session, Check check) {
		List list = session.selectList("member.checkList",check);
		return (ArrayList<Member>)list;
	}

	public ArrayList<Member> search2MemberList(SqlSession session, String[] addr) {
		List list = session.selectList("member.search2List",addr);
		return (ArrayList<Member>)list;
	}

}
