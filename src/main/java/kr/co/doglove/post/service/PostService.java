package kr.co.doglove.post.service;

import kr.co.doglove.post.domain.PageData;
import kr.co.doglove.post.domain.Post;

public interface PostService {
	
	public PageData selectPostList(int currentPage);

	public Post selectOneByNo(int postNo);
}
