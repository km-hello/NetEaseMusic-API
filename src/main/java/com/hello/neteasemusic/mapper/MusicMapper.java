package com.hello.neteasemusic.mapper;

import com.hello.neteasemusic.entity.Music;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicMapper {
    public List<Music>getMusic();

    public Music getMusicDetail(String musicId);

    public  List<Music> search(String name);

    public boolean insertMusic(Music music);

    public boolean updateMusic(Music music);

    public boolean deleteMusic(String musicId);
}