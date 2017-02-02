package com.test.dao;

import java.util.List;

import com.test.vo.BoardVO;

public interface IbatisDao {
	public List<BoardVO> selectBoardList(BoardVO vo);
	
	public void insertBoard(BoardVO vo);
	
	public void updateBoard(BoardVO vo);
	
	public void deleteBoard(String boardId);
}
