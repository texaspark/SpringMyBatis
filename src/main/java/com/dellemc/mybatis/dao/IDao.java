package com.dellemc.mybatis.dao;

import java.util.ArrayList;

import com.dellemc.mybatis.dto.BDto;

public interface IDao {
	
	public ArrayList<BDto> list();
	public void write(final String bName, final String bTitle, final String bContent);
	public BDto contentView(String strID);
	public void modify(String bId, String bName, String bTitle, String bContent);
	public void delete(String strID);
	public BDto reply_view(String strID);
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep, String bIndent);
	public void replyShape(String bGroup, String bStep);
	public void upHit(final String bId);

}
