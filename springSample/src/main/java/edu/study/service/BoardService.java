package edu.study.service;

import java.util.List;

import edu.study.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> listBoard() throws Exception;
	public BoardVO detailBoard(int bno) throws Exception;
}

