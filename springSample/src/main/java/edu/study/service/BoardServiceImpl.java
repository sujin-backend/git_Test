package edu.study.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import edu.study.dao.BoardDAO;
import edu.study.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	BoardDAO boardDAO;
	 
	@Override
	public List<BoardVO> listBoard() throws Exception {
		// TODO Auto-generated method stub
		 return boardDAO.listBoard();
	}

	@Override
	public BoardVO detailBoard(int bno) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.detailBoard(bno);
	}	
	
	
}
