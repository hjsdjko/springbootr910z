package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongjiView;


/**
 * 农机
 *
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface NongjiService extends IService<NongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongjiVO> selectListVO(Wrapper<NongjiEntity> wrapper);
   	
   	NongjiVO selectVO(@Param("ew") Wrapper<NongjiEntity> wrapper);
   	
   	List<NongjiView> selectListView(Wrapper<NongjiEntity> wrapper);
   	
   	NongjiView selectView(@Param("ew") Wrapper<NongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongjiEntity> wrapper);
   	

}

