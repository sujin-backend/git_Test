package edu.study.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.study.vo.BoardVO;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value="/board")
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET) // /board/list
	public String list(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController-list");
		
		//�Խ��� ��� ������ ����
		ArrayList<BoardVO> alist = new ArrayList<BoardVO>();
		// [{BoardVO},{}]
		
		for(int i=0; i<5; i++) {
			//alist ä���ִ� ����
			
			BoardVO vo = new BoardVO();
			vo.setTitle((i+1)+"��° �����Դϴ�.");
			vo.setWriter("�ۼ���"+(i+1));
			vo.setHit(10);
			
			alist.add(vo);
		}
		// alist 5�� BoardVO�� ä���� ����
		
		model.addAttribute("alistKey",alist); //jsp ȭ������ ������ alist ����
		
		
		model.addAttribute("testKey","testValue"); //request.setAttribute("testKey","testValue");
		
		return "board/list";
	}
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)	// /board/view
	public String view(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController-view");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("ù��° �����Դϴ�");
		vo.setContent("ù��° �����Դϴ�.");
		vo.setHit(10);
		vo.setWdate("2021-05-20");
		vo.setWriter("ȫ�浿");
		
		model.addAttribute("voKey",vo);
		model.addAttribute("testKey","testValue"); //request.setAttribute("testKey","testValue");
		
		return "board/view";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)	// /board/view
	public String write(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController-write");
		
		return "board/write";
	}
	
	@RequestMapping(value = "/writeOk", method = RequestMethod.POST)	// /board/view
	public String writeOk(Locale locale, Model model, BoardVO boardVO) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("BoardController-writeOk");
		
		System.out.println("title->"+boardVO.getTitle());
		System.out.println("writer->"+boardVO.getWriter());
		System.out.println("content->"+boardVO.getContent());
		
		return "redirect:/board/list";
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
		
		return "board/modify";
	}
	
}
