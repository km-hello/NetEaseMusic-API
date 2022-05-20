package com.hello.neteasemusic.service;

import com.hello.neteasemusic.entity.VideoGroup;
import com.hello.neteasemusic.mapper.VideoGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoGroupService {
    @Autowired
    private VideoGroupMapper videoGroupMapper;

    public List<VideoGroup>getVideoGroup(){
        return videoGroupMapper.getVideoGroup();
    }
}
