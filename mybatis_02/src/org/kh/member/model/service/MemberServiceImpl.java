package org.kh.member.model.service;

import java.io.IOException;
import java.io.InputStream;

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
		Member m = new MemberDAOImpl().selectOne(session, m);
		return m;
	}


	
}
