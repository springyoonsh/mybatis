package com.example.mapper;

import java.util.List;

import com.example.model.Board;

public interface BoardMapper 
{
	public int insert(Board board);
	public int update(Board board);
	
	public List<Board> selectAll();
}
