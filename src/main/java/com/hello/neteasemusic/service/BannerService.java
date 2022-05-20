package com.hello.neteasemusic.service;

import com.hello.neteasemusic.entity.Banner;
import com.hello.neteasemusic.mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {
    @Autowired
    private BannerMapper bannerMapper;

    public List<Banner> getBanner(){

        return bannerMapper.getBanner();

    }
}
