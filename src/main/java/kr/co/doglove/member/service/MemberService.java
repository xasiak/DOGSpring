package kr.co.doglove.member.service;

import kr.co.doglove.member.domain.Member;

public interface MemberService {
		
	/**
	 * 회원 로그인 Service
	 * @param member
	 * @return
	 */
	public Member selectCheckLogin(Member member);
	
	/**
	 * 회원 상세 조회
	 * @param memberEmail
	 * @return
	 */
	public Member selectOneByEmail(String memberEmail);

	/**
	 * 멤버 등록 Service
	 * @param member
	 * @return
	 */
	public int registerMember(Member member);

	/**
	 * 회원 정보 수정
	 * @param member
	 * @return
	 */
	public int updateMember(Member member);

	/**
	 * 회원 탈퇴
	 * @param memberEmail
	 * @return
	 */
	public int deleteMember(String memberEmail);

}
