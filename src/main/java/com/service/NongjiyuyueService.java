package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongjiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongjiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongjiyuyueView;


/**
 * 农机预约
 *
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface NongjiyuyueService extends IService<NongjiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongjiyuyueVO> selectListVO(Wrapper<NongjiyuyueEntity> wrapper);
   	
   	NongjiyuyueVO selectVO(@Param("ew") Wrapper<NongjiyuyueEntity> wrapper);
   	
   	List<NongjiyuyueView> selectListView(Wrapper<NongjiyuyueEntity> wrapper);
   	
   	NongjiyuyueView selectView(@Param("ew") Wrapper<NongjiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongjiyuyueEntity> wrapper);
   	

}

