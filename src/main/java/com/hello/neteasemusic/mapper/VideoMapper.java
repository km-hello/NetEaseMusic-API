package com.hello.neteasemusic.mapper;

import com.hello.neteasemusic.entity.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoMapper {
    public List<Video>getVideoList(String groupId);
    public List<Video>search(String name);

    public Video getVideoDetailById(String videoId);
    public boolean insertVideo(Video video);
    public boolean updateVideo(Video video);
    public boolean deleteVideo(String videoId);
}
