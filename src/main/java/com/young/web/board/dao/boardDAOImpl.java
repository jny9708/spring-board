package com.young.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.young.web.board.model.BoardVO;

@Repository	
public class boardDAOImpl implements boardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	
	//매개변수 값은 Mapper.xml의 네임스페이스 이름+ Mapper.xml에 있는 id이름
	@Override
	public List<BoardVO> getBoardList() throws Exception {
		return sqlSession.selectList("com.young.web.board.boardMapper.getBoardList");
	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		return sqlSession.selectOne("com.young.web.board.boardMapper.getBoardContent", bid);
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		return sqlSession.insert("com.young.web.board.boardMapper.insertBoard", boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		return sqlSession.update("com.young.web.board.boardMapper.updateBoard", boardVO);	
	}

	@Override
	public int deleteBoard(int bid) throws Exception {
		return sqlSession.insert("com.young.web.board.boardMapper.deleteBoard", bid);
	}

	@Override
	public int updateViewCnt(int bid) throws Exception {
		return sqlSession.update("com.young.web.board.boardMapper.updateViewCnt", bid);
	}

		
}
