package com.edu.mapper;

import com.edu.pojo.Community;

import java.util.List;

/**
 * @Author
 * @create 2021/12/25 15:24
 */
public interface CommuntiyMapper {
    //查询
    List<Community> list(Community community);
    //查询条数
    int countList(Community community);
    //新增
    void save(Community community);
    //删除
    void deleteById(int id);
}
