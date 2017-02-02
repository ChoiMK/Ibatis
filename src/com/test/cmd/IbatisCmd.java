package com.test.cmd;

import java.util.List;

import com.test.biz.IbatisBiz;
import com.test.biz.impl.IbatisBizImpl;
import com.test.vo.BoardVO;

public class IbatisCmd {
	IbatisBiz biz  = new IbatisBizImpl();
	
	public void selectList(){
		BoardVO vo2 = new BoardVO();
//		vo2.setBoardId(vo2.getBoardId());
//		vo2.setBoardTitle(vo2.getBoardTitle());
//		vo2.setBoardWriter(vo2.getBoardWriter());
		List<BoardVO> list = biz.selectBoardList(vo2);
		
		for(BoardVO vo : list){
			System.out.println(vo.getBoardId()+", "+vo.getBoardTitle()+", "+vo.getBoardWriter());
		}
	}
	
	public void insertBoard(){
		BoardVO vo = new BoardVO();
		vo.setBoardTitle("타이틀");
		vo.setBoardWriter("작성자");
		vo.setBoardContent("글내용");
		biz.insertBoard(vo);
	}
	
	public void updateBoard(){
		BoardVO vo = new BoardVO();
		vo.setBoardId("121");
		vo.setBoardTitle("타이틀");
		vo.setBoardWriter("작성자");
		vo.setBoardContent("글내용");
		biz.updateBoard(vo);
	}
	
	public void delete(){
		BoardVO vo = new BoardVO();
		biz.deleteBoard("121");
	}


	public static void main(String[] args) {
		IbatisCmd cmd = new IbatisCmd();
		 
		//cmd.insertBoard();
		//cmd.updateBoard();
		//cmd.delete();
		cmd.selectList();
		
	}
}
