package com.hello.neteasemusic.controller;

import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.Video;
import com.hello.neteasemusic.entity.VideoGroup;
import com.hello.neteasemusic.service.VideoGroupService;
import com.hello.neteasemusic.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class VideoController {
    @Autowired
    private VideoGroupService videoGroupService;
    @Autowired
    private VideoService videoService;

    @PostMapping("/video")
    public boolean insertVideo(@RequestBody Video video){
        return videoService.insertVideo(video);
    }
    @PutMapping("/video")
    public boolean updateVideo(@RequestBody Video video){
        return videoService.updateVideo(video);
    }
    @DeleteMapping("/video")
    public boolean deleteVideo(@RequestParam String videoId){
        return videoService.deleteVideo(videoId);
    }

    @GetMapping("/video/group")
    public List<VideoGroup> getVideoGroup(){
        return videoGroupService.getVideoGroup();
    }
    @GetMapping("/video/list")
    public List<Video>getVideoList(@RequestParam String groupId){
        return videoService.getVideoList(groupId);
    }

    @GetMapping("/video/page")
    public PageInfo<Video> getVideoPage(@RequestParam String name, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "2") int pageSize){
        return videoService.getVideoPage(name,pageNum,pageSize);
    }

    @GetMapping("/video/id")
    public Video getVideoDetailById(@RequestParam String videoId){
        return videoService.getVideoDetailById(videoId);
    }
}
