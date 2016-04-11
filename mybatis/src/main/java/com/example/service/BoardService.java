package com.example.service;

import java.util.List;

import com.example.model.Board;

public interface BoardService 
{
	public int insert(Board board);
	public int update(Board board);
	
	public List<Board> selectAll();
}
