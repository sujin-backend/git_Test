package edu.study.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import edu.study.vo.BoardVO;

@Repository
public class BoardDAO{

	@Inject
	private SqlSession sqlSession;
	    
	private static final String Namespace = "edu.study.mapper.boardMapper";

	public List<BoardVO> listBoard() {
		return sqlSession.selectList(Namespace+".listBoard");
	}
	
	public BoardVO detailBoard(int bno) {
		return sqlSession.selectOne(Namespace+".detailBoard",bno);
	}
	
}
