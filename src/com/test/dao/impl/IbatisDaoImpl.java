package com.test.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.test.dao.IbatisDao;
import com.test.ibatis.SqlMapConfig;
import com.test.vo.BoardVO;

public class IbatisDaoImpl implements IbatisDao{
	private SqlMapClient sqlMap = SqlMapConfig.getSqlMapInstance();

	@Override
	public List<BoardVO> selectBoardList(BoardVO vo) {
		
		List<BoardVO> resultList = null;
		HashMap<String, String> paramMap = new HashMap<String,String>();
		paramMap.put("boardId", vo.getBoardId());
		paramMap.put("boardTitle", vo.getBoardTitle());
		paramMap.put("boardWriter", vo.getBoardWriter());
	
		try {
			resultList = sqlMap.queryForList("test.selectTest",paramMap);
							
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultList;
	}

	@Override
	public void insertBoard(BoardVO vo) {
		HashMap<String, String> paramMap = new HashMap<String,String>();
		paramMap.put("boardId", vo.getBoardId());
		paramMap.put("boardTitle", vo.getBoardTitle());
		paramMap.put("boardWriter", vo.getBoardWriter());
		paramMap.put("boardContent", vo.getBoardContent());
		
		try {
			sqlMap.insert("test.insertTest",paramMap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		HashMap<String, String> paramMap = new HashMap<String,String>();
		paramMap.put("boardId", vo.getBoardId());
		paramMap.put("boardTitle", vo.getBoardTitle());
		paramMap.put("boardWriter", vo.getBoardWriter());
		paramMap.put("boardContent", vo.getBoardContent());
		
		try {
			sqlMap.update("test.updateTest",paramMap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBoard(String boardId) {
		HashMap<String, String> paramMap = new HashMap<String,String>();
		paramMap.put("boardId",boardId);
		
		try {
			sqlMap.insert("test.deleteTest",paramMap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
			
}
