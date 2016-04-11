package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mapper.BoardMapper;
import com.example.model.Board;

@Repository
public class BoardDaoImpl implements BoardDao
{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(Board board) 
	{
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		mapper.insert(board);
		return 0;
	}

	@Override
	public int update(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
