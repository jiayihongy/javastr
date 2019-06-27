package com.andersen.core;

import java.io.Serializable;

import net.sf.json.JSONObject;


/**
 * 接口应答类,所有的接口response响应都是该类
 * <p/>
 * 
 * @author Jiran
 */

public class Response implements Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = -8676698865753074038L;


	/**
	 * 返回码, 具体返回码定义请参见接口文档
	 */
	private int CODE;
	/**
	 * 返回描述
	 */
	private String MSG;

	/**
	 * 接口中有业务数据返回时，该参数保存响应的数据内容
	 */
	private Object DATA = "";

	
	public int getCODE() {
		return CODE;
	}


	public void setCODE(int cODE) {
		CODE = cODE;
	}


	public String getMSG() {
		return MSG;
	}


	public void setMSG(String mSG) {
		MSG = mSG;
	}


	public Object getDATA() {
		return DATA;
	}


	public void setDATA(Object dATA) {
		DATA = dATA;
	}


	/**
	 * 转换成json字符串
	 * @return
	 */
	public String toJsonStr() {
		JSONObject json;
		json = JSONObject.fromObject(this);
		return json.toString();
	}
}
