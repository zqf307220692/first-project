package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.NewsDetail;
import com.zb.mapper.NewsDetailMapper;
import com.zb.service.RpcNewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = RpcNewsDetailService.class)//暴露
public class NewsDetailServiceImpl implements RpcNewsDetailService {
    @Autowired
    private NewsDetailMapper newsDetailMapper;

    @Override
    public List<NewsDetail> getAllNewsDetail() {
        return newsDetailMapper.getAllNewsDetail();
    }

    @Override
    public void delNewsDetail(Integer id) {
        newsDetailMapper.delNewsDetail(id);
    }
}
