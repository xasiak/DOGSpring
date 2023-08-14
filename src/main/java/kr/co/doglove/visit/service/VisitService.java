package kr.co.doglove.visit.service;

import java.util.List;

import kr.co.doglove.visit.domain.Visit;

public interface VisitService {
	
	public int insertBook(Visit visit);

	public List<Visit> selectBookList(String userEmail);
}
