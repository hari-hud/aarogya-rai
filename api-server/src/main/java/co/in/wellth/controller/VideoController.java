package co.in.wellth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.in.wellth.models.Video;
import co.in.wellth.services.IVideoService;


@RestController
//@RequestMapping("/api")
public class VideoController {
	
	@Autowired
	IVideoService videoService;
	
	// @RequestMapping( value = "/educations", method = RequestMethod.GET)
	@GetMapping("/videos")
	public List<Video> getVideos()
	{
		return this.videoService.getVideos();
	}

    @GetMapping("/videos/{id}")
	public Video getVideo(@PathVariable("id") long id)
	{
		return this.videoService.getVideo(id);
	}

	@PostMapping("/videos")
	public Video addVideo(@RequestBody Video education)
	{
		return this.videoService.addVideo(education);
	}
	
	@PutMapping("/videos")
	public Video updateVideo(@RequestBody Video education)
	{
		return this.videoService.updateVideo(education);
	}
	
	@DeleteMapping("/videos/{id}")
	public void deleteVideo(@PathVariable("id") long id)
	{
		this.videoService.deleteVideo(id);
	}
}
