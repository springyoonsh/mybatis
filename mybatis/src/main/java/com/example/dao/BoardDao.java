package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Board;

public interface BoardDao 
{
	public int insert(Board board);
	public int update(Board board);
	
	public List<Board> selectAll();
}
