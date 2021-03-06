package com.ltts.demoProduction.Model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Production {
	private int productionid;
	private String productionname;
	private String adress;
	private String ownername;
	private LocalDate rd; 


	
	
	

	public LocalDate getRd() {
		return rd;
	}
	public void setRd(LocalDate rd) {
		this.rd = rd;
	}
	public Production() {
		super();
	}
	public Production(int productionid, String productionname, String adress, String ownername,LocalDate rd) {
		super();
		this.productionid = productionid;
		this.productionname = productionname;
		this.adress = adress;
		this.ownername = ownername;
		this.rd=rd;
		
		
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
				+ ", ownername=" + ownername ;
	}
	
	
	

}
