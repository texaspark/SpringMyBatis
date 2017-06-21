package com.dellemc.mybatis.command;

import java.util.*;

import javax.servlet.http.*;

import org.springframework.ui.*;

import com.dellemc.mybatis.dao.*;
import com.dellemc.mybatis.dto.*;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
//		BDao dao = new BDao();
//		BDto dto = dao.reply_view(bId);
		
//		model.addAttribute("reply_view", dto);
	}

}
