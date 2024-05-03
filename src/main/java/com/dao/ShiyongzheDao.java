package com.dao;

import com.entity.ShiyongzheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyongzheVO;
import com.entity.view.ShiyongzheView;


/**
 * 使用者
 * 
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface ShiyongzheDao extends BaseMapper<ShiyongzheEntity> {
	
	List<ShiyongzheVO> selectListVO(@Param("ew") Wrapper<ShiyongzheEntity> wrapper);
	
	ShiyongzheVO selectVO(@Param("ew") Wrapper<ShiyongzheEntity> wrapper);
	
	List<ShiyongzheView> selectListView(@Param("ew") Wrapper<ShiyongzheEntity> wrapper);

	List<ShiyongzheView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyongzheEntity> wrapper);
	
	ShiyongzheView selectView(@Param("ew") Wrapper<ShiyongzheEntity> wrapper);
	

}
