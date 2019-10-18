package com.example.bean;

import java.util.Date;
import javax.persistence.Id;
import lombok.Data;

/**
 * 预约记录
 */
@Data
public class OrderRecord {
	/**
	 * 主键
	 */
	@Id
	private int id;
	/**
	 * 车主名字
	 */
	private String userName;
	/**
	 * 车牌号
	 */
	private String carNumber;
	/**
	 * 预约日期
	 */
	private Date date;
	/**
	 * 预约的停车场id
	 */
	private int paringId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getParingId() {
		return paringId;
	}

	public void setParingId(int paringId) {
		this.paringId = paringId;
	}
}
