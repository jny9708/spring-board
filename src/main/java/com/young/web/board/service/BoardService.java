package com.young.web.board.service;

import java.util.List;
//import java.util.Map;

import com.young.web.board.model.BoardVO;

public interface BoardService {
	public List<BoardVO> getBoardList() throws Exception;
	public void insertBoard(BoardVO boardVO) throws Exception;
}