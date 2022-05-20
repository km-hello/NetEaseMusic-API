package com.hello.neteasemusic.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.Music;
import com.hello.neteasemusic.mapper.MusicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    @Autowired
    private MusicMapper musicMapper;

    public List<Music>getMusic(){
        return musicMapper.getMusic();
    }

    public Music getMusicDetail(String musicId){
        return musicMapper.getMusicDetail(musicId);
    }

    public List<Music>search(String name){
        return musicMapper.search(name);
    }

    public PageInfo<Music>getMusicPage(String name ,int pageNum ,int pageSize){
        return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->{
            musicMapper.search(name);
        });
    }

    public boolean insertMusic(Music music){
        return musicMapper.insertMusic(music);
    }

    public boolean updateMusic(Music music){
        return musicMapper.updateMusic(music);
    }

    public boolean deleteMusic(String musicId){
        return musicMapper.deleteMusic(musicId);
    }
}
