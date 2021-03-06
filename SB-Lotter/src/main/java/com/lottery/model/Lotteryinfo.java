package com.lottery.model;
// default package

// Generated 2015-9-13 13:41:05 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * Lotteryinfo generated by hbm2java
 */
@Entity
@Table(name = "lotteryinfo", catalog = "lottery")
public class Lotteryinfo implements java.io.Serializable {

	private Integer id;
	private String name;
	private Date beginTime;
	private Date endTime;
	private String api;
	private Integer state;

	public Lotteryinfo() {
	}

	public Lotteryinfo(String name, Date beginTime, Date endTime, String api, Integer state) {
		this.name = name;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.api = api;
		this.state = state;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "beginTime", length = 19)
	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "endTime", length = 19)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "api", length = 125)
	public String getApi() {
		return this.api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	@Column(name = "state")
	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this, SerializerFeature.WriteMapNullValue);
	}
}
