package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.BoardDao;
import com.example.model.Board;

@Service
public class BoardServiceImpl implements BoardService
{
	@Autowired
	private BoardDao dao;
	
	@Override
	public int insert(Board board) 
	{
		int rst = dao.insert(board);
		return rst;
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
