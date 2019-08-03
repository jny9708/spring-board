package com.young.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.young.web.board.model.BoardVO;
import com.young.web.common.Pagination;

@Repository	
public class boardDAOImpl implements boardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	
	//�Ű����� ���� Mapper.xml�� ���ӽ����̽� �̸�+ Mapper.xml�� �ִ� id�̸�
	@Override
	public List<BoardVO> getBoardList(Pagination pagiantion) throws Exception {
		return sqlSession.selectList("com.young.web.board.boardMapper.getBoardList", pagiantion);
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

	@Override
	public int getBoardListCnt() throws Exception {	
		return sqlSession.selectOne("com.young.web.board.boardMapper.getBoardListCnt");
	}

		
}
