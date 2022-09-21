package com.edu.service;

import com.edu.pojo.Community;

import java.util.List;

/**
 * @Author tang
 * @create 2021/12/25 15:20
 */
public interface CommuntiyService {

    List<Community> list(Community community);

    void save(Community community);

    void deleteById(int id);
}
