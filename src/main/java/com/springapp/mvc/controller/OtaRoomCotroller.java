package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Result;
import com.tomasky.fqxz.bo.param.ArticleListBo;
import com.tomasky.fqxz.service.IArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by simple
 * Date: 2016/10/17
 * Time: 14:56
 */
@Controller
@RequestMapping("/web/otaRoomType")
public class OtaRoomCotroller extends BaseController{

    @Resource
    private IArticleService articleServiceImpl;

    @RequestMapping("/test2")
    @ResponseBody
    public Result test1(){
        ArticleListBo articleListBo = new ArticleListBo();
        articleListBo.setInnId(124);
        articleListBo.setPageNo(1);
        articleListBo.setPageSize(10);
        Map list = articleServiceImpl.getList(articleListBo);
        return successResponse(list);

    }


}
