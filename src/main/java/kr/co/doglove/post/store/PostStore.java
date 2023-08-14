package kr.co.doglove.post.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.doglove.post.domain.Post;

public interface PostStore {
	public List<Post> selectPostList(SqlSession session, int currentPage);

	public Post selectOneByNo(SqlSession session, int postNo);

	public String generatePageNavi(SqlSession session, int currentPage);
	

//	private int getTotalCount(SqlSession session);
}
