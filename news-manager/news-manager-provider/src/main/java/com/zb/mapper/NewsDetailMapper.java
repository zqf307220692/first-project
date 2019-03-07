package com.zb.mapper;

import com.zb.entity.NewsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDetailMapper {
    //获取新闻
    public List<NewsDetail> getAllNewsDetail();

    //删除新闻
    public void delNewsDetail(@Param("delId") Integer id);
}
