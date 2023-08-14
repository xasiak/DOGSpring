package kr.co.doglove.post.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.doglove.post.domain.PageData;
import kr.co.doglove.post.domain.Post;
import kr.co.doglove.post.service.PostService;

@Controller
public class PostController {
	
	private PostService service;
	
	public String showPostDetail(
			@RequestParam("postNo") int postNo
			,Model model) {
		try {
			Post post = service.selectOneByNo(postNo);
			if(post != null) {
				model.addAttribute("post", post);
				return "post/post";
			}else {
				model.addAttribute("msg", "데이터가 존재하지 않습니다.");
				return "common/serviceFailed";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", e.getMessage());
			return "common/serviceFailed";
		}
	}
	
//	public String showPostList(
//			@RequestParam("currentPage") int currentPage
//			,Model model) {
//		try {
//			String page = currentPage != null ? currentPage : "1";
//			currentPage = Integer.parseInt(page);
//			PageData pd = service.selectPostList(currentPage);
//			List<Post> pList = pd.getpList();
//			String pageNavi = pd.getPageNavi();
//			if(!pList.isEmpty()) {
//				model.addAttribute("pList", pList);
//				model.addAttribute("pageNavi", pageNavi);
//				return "post/post";
//			}else {
//				model.addAttribute("msg", "데이터가 존재하지 않습니다.");
//				return "common/serviceFailed";
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			model.addAttribute("msg", e.getMessage());
//			return "common/serviceFailed";
//		}
//	}
}
