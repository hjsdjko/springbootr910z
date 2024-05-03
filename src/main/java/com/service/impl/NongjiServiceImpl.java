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


import com.dao.NongjiDao;
import com.entity.NongjiEntity;
import com.service.NongjiService;
import com.entity.vo.NongjiVO;
import com.entity.view.NongjiView;

@Service("nongjiService")
public class NongjiServiceImpl extends ServiceImpl<NongjiDao, NongjiEntity> implements NongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongjiEntity> page = this.selectPage(
                new Query<NongjiEntity>(params).getPage(),
                new EntityWrapper<NongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongjiEntity> wrapper) {
		  Page<NongjiView> page =new Query<NongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongjiVO> selectListVO(Wrapper<NongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongjiVO selectVO(Wrapper<NongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongjiView> selectListView(Wrapper<NongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongjiView selectView(Wrapper<NongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
