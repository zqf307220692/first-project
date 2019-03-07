package com.zb.service;

import com.zb.entity.NewsComment;

public interface RpcNewsCommentService {
    //添加评论
    public void addNewsComment(NewsComment comment);
}
