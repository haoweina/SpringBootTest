package com.example.bean;

import java.util.Date;
import javax.persistence.Id;
import lombok.Data;

/*
* 停车记录实体类
* */
@Data
public class ParkRecord {
	/*
	* 主键
	* */
	@Id
	private int id;
	/**
	 * 停车场名称
	 */
	private String parkName;
	/**
	 * 日期
	 */
	private String parkDate;
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 费用
	 */
	private double parkPay;

	/*
	 * 用户主键
	 * */
	private int userId;
	/*
	* 用户姓名
	* */
	private String userName;

	/*
	* 用户车牌号
	* */
	private String carNumber;

}
