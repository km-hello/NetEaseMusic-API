package com.hello.neteasemusic.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.Playlist;
import com.hello.neteasemusic.mapper.PlaylistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistMapper playlistMapper;

    public List<Playlist>getPlaylist(){
        return playlistMapper.getPlaylist();
    }
    public Playlist getPlaylistDetailById(String listId){
        return playlistMapper.getPlaylistDetailById(listId);
    }
    public Playlist getListDetail(String listId){
        return playlistMapper.getListDetail(listId);
    }

    public PageInfo<Playlist> getListPage(String name , int pageNum , int pageSize){
        return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->{
            playlistMapper.getListPage(name);
        });
    }
    public boolean insertPlaylist(Playlist playlist){
        return playlistMapper.insertPlaylist(playlist);
    }
    public boolean updatePlaylist(Playlist playlist){
        return playlistMapper.updatePlaylist(playlist);
    }
    public boolean deletePlaylist(String listId){
        return playlistMapper.deletePlaylist(listId);
    }
}
