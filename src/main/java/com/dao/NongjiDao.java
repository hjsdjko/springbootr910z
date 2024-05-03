package com.dao;

import com.entity.NongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongjiVO;
import com.entity.view.NongjiView;


/**
 * 农机
 * 
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface NongjiDao extends BaseMapper<NongjiEntity> {
	
	List<NongjiVO> selectListVO(@Param("ew") Wrapper<NongjiEntity> wrapper);
	
	NongjiVO selectVO(@Param("ew") Wrapper<NongjiEntity> wrapper);
	
	List<NongjiView> selectListView(@Param("ew") Wrapper<NongjiEntity> wrapper);

	List<NongjiView> selectListView(Pagination page,@Param("ew") Wrapper<NongjiEntity> wrapper);
	
	NongjiView selectView(@Param("ew") Wrapper<NongjiEntity> wrapper);
	

}
