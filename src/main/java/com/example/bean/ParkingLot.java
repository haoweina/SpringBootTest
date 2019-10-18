package com.example.bean;

import javax.persistence.Id;
import lombok.Data;

/**
 * 停车场
 */
@Data
public class ParkingLot {
	/**
	 * 主键
	 */
	@Id
	private int id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 营业时间
	 */
	private String time;
	/**
	 * 收费情况（xx元/小时）
	 */
	private String chargeSituation;
	/**
	 * 剩余空位个数
	 */
	private int remainingCount;

}
