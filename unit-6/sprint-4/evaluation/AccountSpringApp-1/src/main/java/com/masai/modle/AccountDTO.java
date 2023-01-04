package com.masai.modle;

public class AccountDTO {

	private Integer srcAccno;
	private Integer desAccno;
	private Integer ammount;

	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountDTO(Integer srcAccno, Integer desAccno, Integer ammount) {
		super();
		this.srcAccno = srcAccno;
		this.desAccno = desAccno;
		this.ammount = ammount;
	}

	public Integer getSrcAccno() {
		return srcAccno;
	}

	public void setSrcAccno(Integer srcAccno) {
		this.srcAccno = srcAccno;
	}

	public Integer getDesAccno() {
		return desAccno;
	}

	public void setDesAccno(Integer desAccno) {
		this.desAccno = desAccno;
	}

	public Integer getAmmount() {
		return ammount;
	}

	public void setAmmount(Integer ammount) {
		this.ammount = ammount;
	}

}
