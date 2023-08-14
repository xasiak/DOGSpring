package kr.co.doglove.member.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.doglove.member.domain.Member;
import kr.co.doglove.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore{

	@Override
	public Member selectCheckLogin(SqlSession sqlSession, Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectOneByEmail(SqlSession sqlSession, String memberEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMember(SqlSession sqlSession, Member member) {
		int result = sqlSession.insert("MemberMapper.insertMember", member);
		return result;
	}

	@Override
	public int updateMember(SqlSession sqlSession, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(SqlSession sqlSession, String memberEmail) {
		// TODO Auto-generated method stub
		return 0;
	}

}
