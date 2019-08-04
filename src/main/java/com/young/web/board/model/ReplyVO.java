package com.young.web.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplyVO {
	
	public int rid;
	public int bid;
	public String content;
	public String reg_id;
	public String reg_dt;
	public String edit_dt;
	
}
