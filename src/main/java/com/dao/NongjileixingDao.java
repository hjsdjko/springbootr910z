package com.dao;

import com.entity.NongjileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongjileixingVO;
import com.entity.view.NongjileixingView;


/**
 * 农机类型
 * 
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface NongjileixingDao extends BaseMapper<NongjileixingEntity> {
	
	List<NongjileixingVO> selectListVO(@Param("ew") Wrapper<NongjileixingEntity> wrapper);
	
	NongjileixingVO selectVO(@Param("ew") Wrapper<NongjileixingEntity> wrapper);
	
	List<NongjileixingView> selectListView(@Param("ew") Wrapper<NongjileixingEntity> wrapper);

	List<NongjileixingView> selectListView(Pagination page,@Param("ew") Wrapper<NongjileixingEntity> wrapper);
	
	NongjileixingView selectView(@Param("ew") Wrapper<NongjileixingEntity> wrapper);
	

}
