package com.young.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.young.web.board.dao.boardDAO;
import com.young.web.board.model.BoardVO;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations= {"classpath:spring/root-context.xml","classpath:spring/dataSource-context.xml","classpath:servlet-context.xml"})
public class BoardDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Inject
	private boardDAO boardDAO;
	
	
	@Test 
	@Ignore
	public void testGetBoardList() throws Exception{
		List<BoardVO> boardList = boardDAO.getBoardList();
		logger.info("\n Board List \n");
		if(boardList.size()>0) {
			for(BoardVO list : boardList) {
				logger.info(list.title);
			}
		}else {
				logger.info("�����Ͱ� �����ϴ�.");
		}	
	}
	
	@Test
	@Ignore 
	public void testGetBoardContent() throws Exception {
		BoardVO boardVO = boardDAO.getBoardContent(1);
		logger.info("\n Board List \n ");
		if(boardVO != null) {
			logger.info("�۹�ȣ : " + boardVO.getBid() );
			logger.info("������ : " + boardVO.getTitle() );
			logger.info("�۳��� : " + boardVO.getContent() );
			logger.info("���±� : " + boardVO.getTag() );
			logger.info("��ȸ�� : " + boardVO.getView_cnt() );
			logger.info("�ۼ��� : " + boardVO.getReg_id() );
			logger.info("�ۼ��� : " + boardVO.getReg_dt() );
			logger.info("������ : " + boardVO.getEdit_dt() );
		} else {
			logger.info("�����Ͱ� �����ϴ�.");
		}
	}

	@Test  
	public void testInsertBoard() throws Exception {
		BoardVO boardVO = new BoardVO();
		//boardVO.setCate_cd("1");
		boardVO.setTitle("첫번쨰 게시물입니다.");
		boardVO.setContent("첫번쨰 게시물입니다.");
		boardVO.setTag("1");
		boardVO.setReg_id("1");
		
		int result = boardDAO.insertBoard(boardVO);
		
		logger.info("\n Insert Board Result " +result);

		if(result == 1) {
			logger.info("\n 성공");
		} else {
			logger.info("\n 실패");
		}
	}


	@Test
	@Ignore 
	public void testUpdateBoard() throws Exception {
		BoardVO boardVO = new BoardVO();
		boardVO.setBid(1);
		//boardVO.setCate_cd("1");
		boardVO.setTitle("ù��° �Խù� �Դϴ�-���� �մϴ�.");
		boardVO.setContent("ù��° �Խù��Դϴ�-�����մϴ�.");
		boardVO.setTag("1-1");
		
		int result = boardDAO.updateBoard(boardVO);

		logger.info("\n Update Board Result \n ");

		if(result > 0) {
			logger.info("\n �Խù� ���� ���� ");
		} else {
			logger.info("\n �Խù� ���� ����");
		}
	}

	

	@Test  
	@Ignore 
	public void tesDeleteBoard() throws Exception {
		int result = boardDAO.deleteBoard(1);
		logger.info("\n Delete Board Result \n ");

		if(result > 0) {
			logger.info("\n �Խù� ���� ���� ");
		} else {
			logger.info("\n �Խù� ���� ����");
		}
	}



	@Test 
	@Ignore
	public void testUpdateViewCnt() throws Exception {
		int result = boardDAO.updateViewCnt(1);
		logger.info("\n Update View Count Result \n ");

		if(result > 0) {
			logger.info("\n �Խù� ��ȸ�� ������Ʈ ���� ");
		} else {
			logger.info("\n �Խù� ��ȸ�� ������Ʈ ����");
		}
	}



	
}
