package com.test.biz.impl;

import java.util.List;

import com.test.biz.IbatisBiz;
import com.test.dao.IbatisDao;
import com.test.dao.impl.IbatisDaoImpl;
import com.test.vo.BoardVO;

public class IbatisBizImpl implements IbatisBiz {
	IbatisDao dao = new IbatisDaoImpl();

	@Override
	public List<BoardVO> selectBoardList(BoardVO vo) {
		return dao.selectBoardList(vo);
	}

	@Override
	public void insertBoard(BoardVO vo) {
		dao.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		dao.updateBoard(vo);
	}

	@Override
	public void deleteBoard(String boardId) {
		dao.deleteBoard(boardId);
	}

}
