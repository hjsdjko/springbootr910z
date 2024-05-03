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


import com.dao.NongjiyuyueDao;
import com.entity.NongjiyuyueEntity;
import com.service.NongjiyuyueService;
import com.entity.vo.NongjiyuyueVO;
import com.entity.view.NongjiyuyueView;

@Service("nongjiyuyueService")
public class NongjiyuyueServiceImpl extends ServiceImpl<NongjiyuyueDao, NongjiyuyueEntity> implements NongjiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongjiyuyueEntity> page = this.selectPage(
                new Query<NongjiyuyueEntity>(params).getPage(),
                new EntityWrapper<NongjiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongjiyuyueEntity> wrapper) {
		  Page<NongjiyuyueView> page =new Query<NongjiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongjiyuyueVO> selectListVO(Wrapper<NongjiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongjiyuyueVO selectVO(Wrapper<NongjiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongjiyuyueView> selectListView(Wrapper<NongjiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongjiyuyueView selectView(Wrapper<NongjiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
