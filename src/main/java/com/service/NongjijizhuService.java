package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongjijizhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongjijizhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongjijizhuView;


/**
 * 农机机主
 *
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface NongjijizhuService extends IService<NongjijizhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongjijizhuVO> selectListVO(Wrapper<NongjijizhuEntity> wrapper);
   	
   	NongjijizhuVO selectVO(@Param("ew") Wrapper<NongjijizhuEntity> wrapper);
   	
   	List<NongjijizhuView> selectListView(Wrapper<NongjijizhuEntity> wrapper);
   	
   	NongjijizhuView selectView(@Param("ew") Wrapper<NongjijizhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongjijizhuEntity> wrapper);
   	

}

