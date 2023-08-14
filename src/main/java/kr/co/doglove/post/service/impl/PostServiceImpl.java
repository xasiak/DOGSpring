package kr.co.doglove.post.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.doglove.post.domain.PageData;
import kr.co.doglove.post.domain.Post;
import kr.co.doglove.post.service.PostService;
import kr.co.doglove.post.store.PostStore;

public class PostServiceImpl implements PostService{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private PostStore pStore;

	@Override
	public PageData selectPostList(int currentPage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post selectOneByNo(int postNo) {
		// TODO Auto-generated method stub
		return null;
	}
}
