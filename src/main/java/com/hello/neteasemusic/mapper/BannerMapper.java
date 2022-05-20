package com.hello.neteasemusic.mapper;

import com.hello.neteasemusic.entity.Banner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BannerMapper {
    public List<Banner>getBanner();
}