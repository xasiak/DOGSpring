package kr.co.doglove.visit.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.doglove.visit.domain.Visit;

public interface VisitStore {
	
	public int insertBook(SqlSession session, Visit visit);

	public List<Visit> selectBookList(SqlSession session, String userEmail);

}
