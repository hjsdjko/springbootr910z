package com.entity.view;

import com.entity.NongjileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农机类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
@TableName("nongjileixing")
public class NongjileixingView  extends NongjileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongjileixingView(){
	}
 
 	public NongjileixingView(NongjileixingEntity nongjileixingEntity){
 	try {
			BeanUtils.copyProperties(this, nongjileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
