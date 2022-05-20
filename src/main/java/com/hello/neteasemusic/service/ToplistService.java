package com.hello.neteasemusic.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.Toplist;
import com.hello.neteasemusic.mapper.ToplistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToplistService {
    @Autowired
    private ToplistMapper toplistMapper;

    public List<Toplist>getToplist(){
        return toplistMapper.getToplist();
    }

    public Toplist getToplistDetailById(String listId){
        return toplistMapper.getToplistDetailById(listId);
    }

    public Toplist getToplistDetail(String listId){
        return toplistMapper.getToplistDetail(listId);
    }

    public PageInfo<Toplist> getListPage(String name , int pageNum , int pageSize){
        return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->{
            toplistMapper.getListPage(name);
        });
    }
    public boolean insertToplist(Toplist toplist){
        return toplistMapper.insertToplist(toplist);
    }
    public boolean updateToplist(Toplist toplist){
        return toplistMapper.updateToplist(toplist);
    }
    public boolean deleteToplist(String listId){
        return toplistMapper.deleteToplist(listId);
    }
}
