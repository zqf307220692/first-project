package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.NewsComment;
import com.zb.mapper.NewsCommentMapper;
import com.zb.service.RpcNewsCommentService;
import com.zb.service.RpcNewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(interfaceClass = RpcNewsCommentService.class)//暴露
public class NewsCommentServiceImpl implements RpcNewsCommentService {
    @Autowired
    private NewsCommentMapper newsCommentMapper;

    @Override
    public void addNewsComment(NewsComment comment) {
        newsCommentMapper.addNewsComment(comment);
    }
}
