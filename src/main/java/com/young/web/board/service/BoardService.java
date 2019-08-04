package com.young.web.board.service;

import java.util.List;
//import java.util.Map;

import com.young.web.board.model.BoardVO;
import com.young.web.board.model.ReplyVO;
import com.young.web.common.Search;

public interface BoardService {
	public List<BoardVO> getBoardList(Search search) throws Exception;
	public void insertBoard(BoardVO boardVO) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public void updateBoard(BoardVO boardVO) throws Exception;
	public void deleteBoard(int bid) throws Exception;
	public int getBoardListCnt(Search search) throws Exception;
	public List<ReplyVO> getReplyList(int bid) throws Exception;
	public int saveReply(ReplyVO replyVO) throws Exception;
	public int updateReply(ReplyVO replyVO) throws Exception;
	public int deleteReply(int rid) throws Exception;
}
