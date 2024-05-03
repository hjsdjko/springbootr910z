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


import com.dao.NongjijizhuDao;
import com.entity.NongjijizhuEntity;
import com.service.NongjijizhuService;
import com.entity.vo.NongjijizhuVO;
import com.entity.view.NongjijizhuView;

@Service("nongjijizhuService")
public class NongjijizhuServiceImpl extends ServiceImpl<NongjijizhuDao, NongjijizhuEntity> implements NongjijizhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongjijizhuEntity> page = this.selectPage(
                new Query<NongjijizhuEntity>(params).getPage(),
                new EntityWrapper<NongjijizhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongjijizhuEntity> wrapper) {
		  Page<NongjijizhuView> page =new Query<NongjijizhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongjijizhuVO> selectListVO(Wrapper<NongjijizhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongjijizhuVO selectVO(Wrapper<NongjijizhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongjijizhuView> selectListView(Wrapper<NongjijizhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongjijizhuView selectView(Wrapper<NongjijizhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
