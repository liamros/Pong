package it.wave3.pong.dto;

import it.wave3.pong.vo.PositionVO;

public class PositionDTO {
	
	private PositionVO position;
	private String msg;
	public PositionVO getPosition() {
		return position;
	}
	public void setPosition(PositionVO position) {
		this.position = position;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
