package com.edu.service.impl;

import com.edu.mapper.CommuntiyMapper;
import com.edu.pojo.Community;
import com.edu.service.CommuntiyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author
 * @create 2021/12/25 15:20
 */
@Service
public class CommuntiyServiceImpl implements CommuntiyService {
    @Resource
    private CommuntiyMapper communtiyMapper;

    @Override
    public List<Community> list(Community community) {

        return communtiyMapper.list(community);
    }

    @Override
    public void save(Community community) {
        communtiyMapper.save(community);
    }

    @Override
    public void deleteById(int id) {
        communtiyMapper.deleteById(id);

    }
}
