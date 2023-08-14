package kr.co.doglove.member.service;

import kr.co.doglove.member.domain.Member;

public interface MemberService {
		
	/**
	 * ȸ�� �α��� Service
	 * @param member
	 * @return
	 */
	public Member selectCheckLogin(Member member);
	
	/**
	 * ȸ�� �� ��ȸ
	 * @param memberEmail
	 * @return
	 */
	public Member selectOneByEmail(String memberEmail);

	/**
	 * ��� ��� Service
	 * @param member
	 * @return
	 */
	public int registerMember(Member member);

	/**
	 * ȸ�� ���� ����
	 * @param member
	 * @return
	 */
	public int updateMember(Member member);

	/**
	 * ȸ�� Ż��
	 * @param memberEmail
	 * @return
	 */
	public int deleteMember(String memberEmail);

}
