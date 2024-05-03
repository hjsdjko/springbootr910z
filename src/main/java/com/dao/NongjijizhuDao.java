package com.dao;

import com.entity.NongjijizhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongjijizhuVO;
import com.entity.view.NongjijizhuView;


/**
 * 农机机主
 * 
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface NongjijizhuDao extends BaseMapper<NongjijizhuEntity> {
	
	List<NongjijizhuVO> selectListVO(@Param("ew") Wrapper<NongjijizhuEntity> wrapper);
	
	NongjijizhuVO selectVO(@Param("ew") Wrapper<NongjijizhuEntity> wrapper);
	
	List<NongjijizhuView> selectListView(@Param("ew") Wrapper<NongjijizhuEntity> wrapper);

	List<NongjijizhuView> selectListView(Pagination page,@Param("ew") Wrapper<NongjijizhuEntity> wrapper);
	
	NongjijizhuView selectView(@Param("ew") Wrapper<NongjijizhuEntity> wrapper);
	

}
