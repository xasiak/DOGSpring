package kr.co.doglove.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.doglove.member.domain.Member;
import kr.co.doglove.member.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping(value="/member/terms.do", method=RequestMethod.GET)
	public String showRegisterForm() {
		return "member/register";
	}
	
	@RequestMapping(value="/member/register.do", method=RequestMethod.POST)
	public String registerMember(
			@RequestParam("member-email") String memberEmail
			, @RequestParam("member-email") String memberPw
			, @RequestParam("member-name") String memberName
			, @RequestParam("member-phone") String memberPhone
			, Model model) {
		try {
			Member member = new Member(memberEmail, memberPw, memberName, memberPhone);
			int result = service.registerMember(member);
			if(result > 0) {
				model.addAttribute("msg", "회원가입에 성공했습니다");
				return "common/serviceSuccess";
			}else {
				model.addAttribute("msg", "회원가입이 완료되지 않았습니다.");
				return "common/serviceFailed";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", e.getMessage());
			return "common/serviceFailed";
		}
	}
	
//	@RequestMapping(value="/memberlogin.do", method=RequestMethod.POST)
//	public String memberLogin(
//			HttpServletRequest request
//			, @Re)
	
}
