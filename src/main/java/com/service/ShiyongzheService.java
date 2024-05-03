package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyongzheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyongzheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyongzheView;


/**
 * 使用者
 *
 * @author 
 * @email 
 * @date 2022-03-17 15:20:25
 */
public interface ShiyongzheService extends IService<ShiyongzheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyongzheVO> selectListVO(Wrapper<ShiyongzheEntity> wrapper);
   	
   	ShiyongzheVO selectVO(@Param("ew") Wrapper<ShiyongzheEntity> wrapper);
   	
   	List<ShiyongzheView> selectListView(Wrapper<ShiyongzheEntity> wrapper);
   	
   	ShiyongzheView selectView(@Param("ew") Wrapper<ShiyongzheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyongzheEntity> wrapper);
   	

}

