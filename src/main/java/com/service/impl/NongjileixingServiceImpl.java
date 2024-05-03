package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NongjileixingDao;
import com.entity.NongjileixingEntity;
import com.service.NongjileixingService;
import com.entity.vo.NongjileixingVO;
import com.entity.view.NongjileixingView;

@Service("nongjileixingService")
public class NongjileixingServiceImpl extends ServiceImpl<NongjileixingDao, NongjileixingEntity> implements NongjileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongjileixingEntity> page = this.selectPage(
                new Query<NongjileixingEntity>(params).getPage(),
                new EntityWrapper<NongjileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongjileixingEntity> wrapper) {
		  Page<NongjileixingView> page =new Query<NongjileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongjileixingVO> selectListVO(Wrapper<NongjileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongjileixingVO selectVO(Wrapper<NongjileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongjileixingView> selectListView(Wrapper<NongjileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongjileixingView selectView(Wrapper<NongjileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
