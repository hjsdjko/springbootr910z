package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongjileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongjileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongjileixingView;


/**
 * 农机类型
 *
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface NongjileixingService extends IService<NongjileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongjileixingVO> selectListVO(Wrapper<NongjileixingEntity> wrapper);
   	
   	NongjileixingVO selectVO(@Param("ew") Wrapper<NongjileixingEntity> wrapper);
   	
   	List<NongjileixingView> selectListView(Wrapper<NongjileixingEntity> wrapper);
   	
   	NongjileixingView selectView(@Param("ew") Wrapper<NongjileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongjileixingEntity> wrapper);
   	

}

