package com.hello.neteasemusic.controller;

import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.Playlist;
import com.hello.neteasemusic.entity.Toplist;
import com.hello.neteasemusic.service.PlaylistService;
import com.hello.neteasemusic.service.ToplistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class ListController {
    @Autowired
    private PlaylistService playlistService;
    @Autowired
    private ToplistService toplistService;

    @GetMapping("/playlist/id")
    public Playlist getPlaylistDetailById(@RequestParam String listId){
        return playlistService.getPlaylistDetailById(listId);
    }
    @GetMapping("/playlist")
    public List<Playlist> getPlaylist(){
        return playlistService.getPlaylist();
    }
    @PostMapping("/playlist")
    public boolean insertPlaylist(@RequestBody Playlist playlist){
        return playlistService.insertPlaylist(playlist);
    }
    @PutMapping("/playlist")
    public boolean updatePlaylist(@RequestBody Playlist playlist){
        return playlistService.updatePlaylist(playlist);
    }
    @DeleteMapping("/playlist")
    public boolean deletePlaylist(@RequestParam String listId){
        return playlistService.deletePlaylist(listId);
    }

    @GetMapping("/playlist/detail")
    public Playlist getListDetail(@RequestParam String listId){
        return playlistService.getListDetail(listId);
    }

    @GetMapping("/playlist/page")
    public PageInfo<Playlist> getPlaylistPage(@RequestParam String name, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "2") int pageSize){
        return playlistService.getListPage(name,pageNum,pageSize);
    }


    @GetMapping("/toplist/id")
    public Toplist getToplistDetailById(@RequestParam String listId){
        return toplistService.getToplistDetailById(listId);
    }
    @GetMapping("/toplist")
    public List<Toplist>getToplist(){
        return toplistService.getToplist();
    }

    @PostMapping("/toplist")
    public boolean insertToplist(@RequestBody Toplist toplist){
        return toplistService.insertToplist(toplist);
    }
    @PutMapping("/toplist")
    public boolean updateToplist(@RequestBody Toplist toplist){
        return toplistService.updateToplist(toplist);
    }
    @DeleteMapping("/toplist")
    public boolean deleteToplist(@RequestParam String listId){
        return toplistService.deleteToplist(listId);
    }

    @GetMapping("/toplist/detail")
    public Toplist getToplistDetail(@RequestParam String listId){
        return toplistService.getToplistDetail(listId);
    }

    @GetMapping("/toplist/page")
    public PageInfo<Toplist> getTopListPage(@RequestParam String name, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "2") int pageSize) {
        return toplistService.getListPage(name, pageNum, pageSize);
    }
}
