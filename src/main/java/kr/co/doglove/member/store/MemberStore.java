package kr.co.doglove.member.store;

import org.apache.ibatis.session.SqlSession;

import kr.co.doglove.member.domain.Member;

public interface MemberStore {
	
	public Member selectCheckLogin(SqlSession sqlSession, Member member);
	
	public Member selectOneByEmail(SqlSession sqlSession, String memberEmail);

	public int insertMember(SqlSession sqlSession, Member member);

	public int updateMember(SqlSession sqlSession, Member member);

	public int deleteMember(SqlSession sqlSession, String memberEmail);
}
