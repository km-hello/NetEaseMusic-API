package com.hello.neteasemusic.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.Video;
import com.hello.neteasemusic.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoMapper videoMapper;

    public List<Video>getVideoList(String groupId){
        return videoMapper.getVideoList(groupId);
    }

    public PageInfo<Video> getVideoPage(String name , int pageNum , int pageSize){
        return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->{
            videoMapper.search(name);
        });
    }

    public Video getVideoDetailById(String videoId){
        return videoMapper.getVideoDetailById(videoId);
    }

    public boolean insertVideo(Video video){
        return videoMapper.insertVideo(video);
    }

    public boolean updateVideo(Video video){
        return videoMapper.updateVideo(video);
    }

    public boolean deleteVideo(String videoId){
        return videoMapper.deleteVideo(videoId);
    }
}
