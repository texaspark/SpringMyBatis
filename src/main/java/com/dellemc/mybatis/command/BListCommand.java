package com.dellemc.mybatis.command;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.*;

import com.dellemc.mybatis.dao.*;
import com.dellemc.mybatis.dto.*;

public class BListCommand implements BCommand {
	
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public void execute(Model model) {
		
//		BDao dao = new BDao();
//		ArrayList<BDto> dto = dao.list();

	}

}
