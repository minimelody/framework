package org.kh.member.model.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kh.member.model.dao.MemberDAOImpl;
import org.kh.member.model.vo.Member;

public class MemberServiceImpl{
	
	public SqlSession getSqlSession() {
		String resource = "/mybatis-config.xml";
		SqlSession session = null;
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(is);
			session = factory.openSession(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	public Member idFind(String userId) {
		SqlSession session = getSqlSession();
		Member m = new MemberDAOImpl().idFind(session,userId);
		return m;
	}

	public Member selectOne(Member m) {
		SqlSession session = getSqlSession();
		Member m1 = new MemberDAOImpl().selectOne(session, m);
		return m1;
	}

	public int insertMember(Member m) {
		SqlSession session = getSqlSession();
		int result = new MemberDAOImpl().insertMember(session,m);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	public Member updateMember(Member m) {
		SqlSession session = getSqlSession();
		Member m2 = new MemberDAOImpl().updateMember(session,m);
		return m2;
	}

	public int deleteMember(Member m) {
		SqlSession session = getSqlSession();
		int result = new MemberDAOImpl().deleteMember(session,m);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}

	public ArrayList<Member> selectAllMember() {
		SqlSession session = getSqlSession();
		ArrayList<Member> list = new MemberDAOImpl().selectAllMember(session);
		return list;
	}

	public int updateMemberTwo(Member m) {
		SqlSession session = getSqlSession();
		int result = new MemberDAOImpl().updateMemberTwo(session,m);
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}
		return result;
	}


	
}
