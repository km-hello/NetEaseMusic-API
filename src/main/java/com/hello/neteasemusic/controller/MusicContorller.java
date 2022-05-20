package com.hello.neteasemusic.controller;

import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.Music;
import com.hello.neteasemusic.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class MusicContorller {
    @Autowired
    private MusicService musicService;

//    获取所有歌曲
    @GetMapping("/music")
    public List<Music> getMusic(){
        return musicService.getMusic();
    }
//    插入歌曲
    @PostMapping("/music")
    public boolean insertMusic(@RequestBody Music music){
        return musicService.insertMusic(music);
    }
//    更新歌曲
    @PutMapping("/music")
    boolean updateMusic(@RequestBody Music music){
        return musicService.updateMusic(music);
    }
//    删除歌曲
    @DeleteMapping("/music")
    boolean deleteMusic(@RequestParam String musicId){
        return musicService.deleteMusic(musicId);
    }

//    获取歌曲详情
    @GetMapping("/music/detail")
    public Music getMusicDetail(@RequestParam String musicId){
        return musicService.getMusicDetail(musicId);
    }
//    模糊搜索音乐接口
    @GetMapping("music/search")
    public List<Music>search(@RequestParam String name){
        return musicService.search(name);
    }

//    分页查询音乐接口
    @GetMapping("music/page")
    public PageInfo<Music> getMusicPage(@RequestParam String name, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "2") int pageSize){
        return musicService.getMusicPage(name,pageNum,pageSize);
    }
}
