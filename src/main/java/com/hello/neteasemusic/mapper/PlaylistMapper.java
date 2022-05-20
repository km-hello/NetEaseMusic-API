package com.hello.neteasemusic.mapper;

import com.hello.neteasemusic.entity.Playlist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlaylistMapper {
    public List<Playlist>getPlaylist();

    public Playlist getPlaylistDetailById(String listId);

    public Playlist getListDetail(String listId);

    public List<Playlist> getListPage(String name);

    public boolean insertPlaylist(Playlist playlist);

    public boolean updatePlaylist(Playlist playlist);

    public boolean deletePlaylist(String listId);
}