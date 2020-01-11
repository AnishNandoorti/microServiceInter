package com.microservice.entity;

import java.io.Serializable;
import java.util.List;

public class CustResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7731637099237025205L;
	private List<CustomerData> custData;
	private String respCode;
	private String respDesc;

	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}

	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	/**
	 * @return the respDesc
	 */
	public String getRespDesc() {
		return respDesc;
	}

	/**
	 * @param respDesc the respDesc to set
	 */
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	/**
	 * @return the custData
	 */
	public List<CustomerData> getCustData() {
		return custData;
	}

	/**
	 * @param custData the custData to set
	 */
	public void setCustData(List<CustomerData> custData) {
		this.custData = custData;
	}

}
