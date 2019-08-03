package com.young.web.board.dao;

import java.util.List;

import com.young.web.board.model.BoardVO;
import com.young.web.common.Pagination;

public interface boardDAO {
	
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
	
	public BoardVO getBoardContent(int bid) throws Exception;
	
	public int insertBoard(BoardVO boardVO) throws Exception;
	
	public int updateBoard(BoardVO boardVO) throws Exception;
	
	public int deleteBoard(int bid) throws Exception;
	
	public int updateViewCnt(int bid) throws Exception;
	
	public int getBoardListCnt() throws Exception;

}
