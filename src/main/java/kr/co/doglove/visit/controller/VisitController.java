package kr.co.doglove.visit.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.doglove.visit.domain.Visit;
import kr.co.doglove.visit.service.VisitService;

public class VisitController {
	
	@Autowired
	private VisitService service;
	
	@RequestMapping(value="visit/book.do", method=RequestMethod.GET)
	public String showBookView() {
		return "member/book";
	}
	
	@RequestMapping(value="visit/location.do", method=RequestMethod.GET)
	public String showLocationView() {
		return "member/location";
	}
	
	@RequestMapping(value="/visit/book.do", method=RequestMethod.POST)
	public String Book(
		@RequestParam("user-name") String bookUserName
		, @RequestParam("user-phone") String bookUserPhone
		, @RequestParam("user-email") String bookUserEmail
		, @RequestParam("point") String bookPoint
		, @RequestParam("select-date") Date date
		, @RequestParam("select-time") String bookTime
		, @RequestParam("concerns") String bookConcern
		, @RequestParam("house") String bookUserHouse
		, @RequestParam("house-hold") String bookUserHouseHold
		, Model model) {
		try {
			java.sql.Date bookDate = new java.sql.Date(date.getTime());
			Visit visit = new Visit(bookUserName, bookUserPhone, bookUserEmail, bookPoint, bookDate, bookTime, bookConcern, bookUserHouse, bookUserHouseHold);
			int result = service.insertBook(visit);
			if(result > 0) {
				model.addAttribute("msg", "�湮������ �Ϸ�Ǿ����ϴ�.");
				return "common/serviceSuccess";
			}else {
				model.addAttribute("msg", "�湮���࿡ �����Ͽ����ϴ�.");
				return "common/serviceFailed";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", e.getMessage());
			return "common/serviceFailed";
		}
	}
	
	@RequestMapping(value="/visit/bookList.do", method=RequestMethod.GET)
	public String BookList(
			@RequestParam("user-email") String userEmail
			, Model model) {
		try {
			List<Visit> vList = service.selectBookList(userEmail);
			if(!vList.isEmpty()) {
				model.addAttribute("vList", vList);
				return "visit/bookList";
			}else {
				model.addAttribute("msg", "������ ��ȸ�� �Ϸ���� �ʾҽ��ϴ�.");
				return "common/serviceFailed";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", e.getMessage());
			return "common/serviceFailed";
		}
	}
	
}
