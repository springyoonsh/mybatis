package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.BoardDaoImpl;
import com.example.model.Board;

@Controller
public class BoardController 
{	
	@Autowired
	private BoardDaoImpl dao;
	
	@RequestMapping("/")
	public String list()
	{
		Board board = new Board("america", "kgb");

		int rst = dao.insert(board);

		System.out.println(rst);
		
		return "list";
	}
}
