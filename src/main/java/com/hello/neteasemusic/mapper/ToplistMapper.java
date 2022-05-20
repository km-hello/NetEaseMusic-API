package com.hello.neteasemusic.mapper;

import com.hello.neteasemusic.entity.Toplist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ToplistMapper {
    public List<Toplist>getToplist();

    public Toplist getToplistDetailById(String listId);

    public Toplist getToplistDetail(String listId);

    public List<Toplist>getListPage(String name);

    public boolean insertToplist (Toplist toplist);

    public boolean updateToplist(Toplist toplist);

    public boolean deleteToplist(String listId);
}