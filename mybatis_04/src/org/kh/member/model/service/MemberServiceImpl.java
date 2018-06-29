package org.kh.member.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.kh.common.SqlSessionTemplate;
import org.kh.member.model.dao.MemberDAOImpl;
import org.kh.member.model.vo.Check;
import org.kh.member.model.vo.Member;
import org.kh.member.model.vo.Search;

public class MemberServiceImpl {

	public Member login(Member m) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member m1 = new MemberDAOImpl().login(session,m);
		return m1;
	}

	public int enroll(Member m) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDAOImpl().enroll(session,m);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	public int update(Member m) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDAOImpl().update(session,m);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}
	
	public int delete(String memberId) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		int result = new MemberDAOImpl().delete(session,memberId);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	public ArrayList<Member> allMember() {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list = new MemberDAOImpl().allMember(session);
		return list;
	}

	public Member oneMember(String memberId) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		Member m = new MemberDAOImpl().oneMember(session, memberId);
		return m;
	}

	public ArrayList<Member> searchMemberList(Search search) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list = new MemberDAOImpl().searchMemberList(session,search);
		return list;
	}

	public ArrayList<Member> checkMemberList(Check check) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list = new MemberDAOImpl().searchMemberList(session,check);
		return list;
	}

	public ArrayList<Member> search2MemberList(String[] addr) {
		SqlSession session = SqlSessionTemplate.getSqlSession();
		ArrayList<Member> list = new MemberDAOImpl().search2MemberList(session,addr);
		return list;
	}
}


