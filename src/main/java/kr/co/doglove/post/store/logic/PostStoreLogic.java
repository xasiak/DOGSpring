package kr.co.doglove.post.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.doglove.post.domain.Post;
import kr.co.doglove.post.store.PostStore;

@Repository
public class PostStoreLogic implements PostStore{

	@Override
	public List<Post> selectPostList(SqlSession session, int currentPage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post selectOneByNo(SqlSession session, int postNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generatePageNavi(SqlSession session, int currentPage) {
		// TODO Auto-generated method stub
		return null;
	}


}
