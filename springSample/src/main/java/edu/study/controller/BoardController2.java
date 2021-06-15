package edu.study.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.study.service.BoardService;
import edu.study.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value="/board2")
@Controller
public class BoardController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController2.class);
	
	@Inject
	private BoardService boardService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET) // /board/list
	public String list(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController2-list");
		
		List<BoardVO> alist = boardService.listBoard();
		
		model.addAttribute("alist", alist);
		
		
		return "board2/list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET) // /board/list
	public String view(Locale locale, Model model, int bno) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		BoardVO vo = boardService.detailBoard(bno);
		
		model.addAttribute("vo", vo);
		
		return "board2/view";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)	// /board/view
	public String write(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController-write");
		
		return "board2/write";
	}
	
	@RequestMapping(value = "/writeOk", method = RequestMethod.POST)	// /board/view
	public String writeOk(Locale locale, Model model, BoardVO boardVO) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController-writeOk");
		
		System.out.println("title->"+boardVO.getTitle());
		System.out.println("writer->"+boardVO.getWriter());
		System.out.println("content->"+boardVO.getContent());
		
		return "redirect:/board2/list";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)	// /board/view
	public String modify(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController-modify");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("this is title");
		vo.setWdate("2021-05-21");
		vo.setWriter("writer1");
		vo.setContent("this is content");
		
		model.addAttribute("vo",vo);
		
		return "board2/modify";
	}
	
}
