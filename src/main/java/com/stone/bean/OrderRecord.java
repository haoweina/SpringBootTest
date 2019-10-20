package com.stone.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 预约记录
 */
@Data
@Table(name = "order_record")
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
	@Column(name = "parking_id")
	private int paringId;

	/*
	* 预约状态
	* 0：取消预约，1： 预约
	* */
	private String status;

}
