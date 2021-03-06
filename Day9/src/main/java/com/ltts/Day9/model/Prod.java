package com.ltts.Day9.model;

public class Prod {
	private int productionid;
	private String productionname;
	private String adress;
	private String ownername;
	private String rd;
	
	
	
	
	public Prod() {
		super();
	}
	public Prod(int productionid, String productionname, String adress, String ownername,String rd) {
		super();
		this.productionid = productionid;
		this.productionname = productionname;
		this.adress = adress;
		this.ownername = ownername;
		this.rd=rd;
	}
	
	
	public String getRd() {
		return rd;
	}
	public void setRd(String rd) {
		this.rd = rd;
	}
	public int getProductionid() {
		return productionid;
	}
	public void setProductionid(int productionid) {
		this.productionid = productionid;
	}
	public String getProductionname() {
		return productionname;
	}
	public void setProductionname(String productionname) {
		this.productionname = productionname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	@Override
	public String toString() {
		return "productionid=" + productionid + ", productionname=" + productionname + ", adress=" + adress
				+ ", ownername=" + ownername + "]";
	}
	
	

}
