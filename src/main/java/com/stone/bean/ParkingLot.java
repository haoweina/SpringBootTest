package com.stone.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 停车场
 */
@Data
@Table(name = "parking_lot")
public class ParkingLot {
	/**
	 * 主键
	 */
	@Id
	private Integer id;
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
	@Column(name = "price")
	private String chargeSituation;
	/**
	 * 剩余空位个数
	 */
	@Column(name = "remaining_count")
	private Integer remainingCount;

}
