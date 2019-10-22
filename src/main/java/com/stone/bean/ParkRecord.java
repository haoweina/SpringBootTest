package com.stone.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
* 停车记录实体类
* */
@Data
@Table(name = "parking_record")
public class ParkRecord {
	/*
	* 主键
	* */
	@Id
	private Integer id;
	/**
	 * 停车场名称
	 */
	@Column(name="park_name")
	private String parkName;
	/**
	 * 日期
	 */
	@Column(name="park_dame")
	private String parkDate;
	/**
	 * 开始时间
	 */
	@Column(name="start_time")
	private Date startTime;
	/**
	 * 结束时间
	 */
	@Column(name="end_time")
	private Date endTime;
	/**
	 * 费用
	 */
	@Column(name="park_pay")
	private double parkPay;

	/*
	 * 用户主键
	 * */
	@Column(name="user_id")
	private Integer userId;
	/*
	* 用户姓名
	* */
	@Column(name="user_name")
	private String userName;

	/*
	* 用户车牌号
	* */
	@Column(name="car_number")
	private String carNumber;

}
