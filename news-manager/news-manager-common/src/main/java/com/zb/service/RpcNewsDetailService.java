package com.zb.service;

import com.zb.entity.NewsDetail;

import java.util.List;

public interface RpcNewsDetailService {
    //获取新闻
    public List<NewsDetail> getAllNewsDetail();

    //删除新闻
    public void delNewsDetail(Integer id);
}
