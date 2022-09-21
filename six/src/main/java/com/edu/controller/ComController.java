package com.edu.controller;

import com.edu.mapper.CommuntiyMapper;
import com.edu.pojo.Community;
import com.edu.service.CommuntiyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author
 * @create 2021/12/25 15:12
 */
@Controller
public class ComController {

    @Resource
    private CommuntiyService communtiyService;

    @Resource
    private CommuntiyMapper communtiyMapper;

    //显示页面
    @RequestMapping("/list")
    public String findAll(Community community, Model model, HttpServletRequest request){
        List<Community> communityList = communtiyService.list(community);
        int count = communtiyMapper.countList(community);
        model.addAttribute("communityList",communityList);
//        model.addAttribute("count",communityList.size());
        model.addAttribute("count",count);
        return "list";
    }
    //新增页面
    @RequestMapping("/addUI")
    public String addUI(){
        return "addUI";
    }
    //新增方法
    @RequestMapping("/add")
    public String add(Community community){
        communtiyService.save(community);
        return "redirect:/list";
    }
    //删除方法
    @RequestMapping("/del")
    public String del(int id){
        communtiyService.deleteById(id);
        return "redirect:/list";
    }
}
