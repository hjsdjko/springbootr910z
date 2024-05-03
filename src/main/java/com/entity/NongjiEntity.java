package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 农机
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
@TableName("nongji")
public class NongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongjiEntity() {
		
	}
	
	public NongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 农机名称
	 */
					
	private String nongjimingcheng;
	
	/**
	 * 封面图片
	 */
					
	private String fengmiantupian;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 型号
	 */
					
	private String xinghao;
	
	/**
	 * 农机类型
	 */
					
	private String nongjileixing;
	
	/**
	 * 日租价
	 */
					
	private Integer rizujia;
	
	/**
	 * 机主账号
	 */
					
	private String jizhuzhanghao;
	
	/**
	 * 机主姓名
	 */
					
	private String jizhuxingming;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：农机名称
	 */
	public void setNongjimingcheng(String nongjimingcheng) {
		this.nongjimingcheng = nongjimingcheng;
	}
	/**
	 * 获取：农机名称
	 */
	public String getNongjimingcheng() {
		return nongjimingcheng;
	}
	/**
	 * 设置：封面图片
	 */
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：型号
	 */
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	/**
	 * 获取：型号
	 */
	public String getXinghao() {
		return xinghao;
	}
	/**
	 * 设置：农机类型
	 */
	public void setNongjileixing(String nongjileixing) {
		this.nongjileixing = nongjileixing;
	}
	/**
	 * 获取：农机类型
	 */
	public String getNongjileixing() {
		return nongjileixing;
	}
	/**
	 * 设置：日租价
	 */
	public void setRizujia(Integer rizujia) {
		this.rizujia = rizujia;
	}
	/**
	 * 获取：日租价
	 */
	public Integer getRizujia() {
		return rizujia;
	}
	/**
	 * 设置：机主账号
	 */
	public void setJizhuzhanghao(String jizhuzhanghao) {
		this.jizhuzhanghao = jizhuzhanghao;
	}
	/**
	 * 获取：机主账号
	 */
	public String getJizhuzhanghao() {
		return jizhuzhanghao;
	}
	/**
	 * 设置：机主姓名
	 */
	public void setJizhuxingming(String jizhuxingming) {
		this.jizhuxingming = jizhuxingming;
	}
	/**
	 * 获取：机主姓名
	 */
	public String getJizhuxingming() {
		return jizhuxingming;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}

}
