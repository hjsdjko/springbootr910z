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


import com.dao.ShiyongzheDao;
import com.entity.ShiyongzheEntity;
import com.service.ShiyongzheService;
import com.entity.vo.ShiyongzheVO;
import com.entity.view.ShiyongzheView;

@Service("shiyongzheService")
public class ShiyongzheServiceImpl extends ServiceImpl<ShiyongzheDao, ShiyongzheEntity> implements ShiyongzheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyongzheEntity> page = this.selectPage(
                new Query<ShiyongzheEntity>(params).getPage(),
                new EntityWrapper<ShiyongzheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyongzheEntity> wrapper) {
		  Page<ShiyongzheView> page =new Query<ShiyongzheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyongzheVO> selectListVO(Wrapper<ShiyongzheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyongzheVO selectVO(Wrapper<ShiyongzheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyongzheView> selectListView(Wrapper<ShiyongzheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyongzheView selectView(Wrapper<ShiyongzheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
