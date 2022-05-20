package com.hello.neteasemusic.mapper;

import com.hello.neteasemusic.entity.VideoGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoGroupMapper {
    public List<VideoGroup>getVideoGroup();
}
