package com.zb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.entity.NewsComment;
import com.zb.entity.NewsDetail;
import com.zb.service.RpcNewsCommentService;
import com.zb.service.RpcNewsDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class NewsController {
    public static Integer sid =null;

    @Reference(timeout = 10000)
    private RpcNewsDetailService rpcNewsDetailService;
    @Reference(timeout = 10000)
    private RpcNewsCommentService rpcNewsCommentService;

    @RequestMapping(value = "/index")
    //加@ResponseBody 显示字符串
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public List<NewsDetail> show(){
        return rpcNewsDetailService.getAllNewsDetail();
    }

    @RequestMapping(value = "/del")
    @ResponseBody
    public String del(Integer id){
        if(id!=null){
            rpcNewsDetailService.delNewsDetail(id);
            return "ok";
        }else{
            return "not";
        }
    }

    @RequestMapping("/toadd/{id}")
    public String toadd(@PathVariable Integer id){
        sid=id;
        return "/add";
    }

    @RequestMapping(value = "/doadd")
    @ResponseBody
    public String doadd(@RequestParam  String commentContent, String commentAuthor) {
        NewsComment nc=new NewsComment();
        nc.setNewsId(sid);
        nc.setCommentAuthor(commentAuthor);
        nc.setCommentContent(commentContent);

        Date date=new Date();
        SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String f=formater.format(date);
        nc.setCommentCreateDate(f);
        rpcNewsCommentService.addNewsComment(nc);
        if (nc!=null) {
            return "ok";
        }else{
            return "not";
        }
    }

}
