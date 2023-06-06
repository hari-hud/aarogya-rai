package in.aarogyarai.controller;

import in.aarogyarai.models.Video;
import in.aarogyarai.pojo.CreateVideoRequest;
import in.aarogyarai.pojo.CreateVideoResponse;
import in.aarogyarai.services.IVideoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.modelmapper.ModelMapper;

@RestController
//@RequestMapping("/api")
@Tag(name = "Videos")
public class VideoController {
	
	@Autowired
	IVideoService videoService;
	
	@Autowired
	ModelMapper modelMapper;
	
	// @RequestMapping( value = "/videos", method = RequestMethod.GET)
	//@Hidden // hides api endpoint from swagger ui
	@GetMapping("/videos")
	public List<Video> getVideos()
	{
		return this.videoService.getVideos();
	}

    @GetMapping("/videos/{id}")
    @Operation(summary = "Return a video", description = "Takes id and return single product")
	public @ApiResponse(description = "Video Object") Video getVideo(@Parameter(description = "Id of the video") @PathVariable("id") long id)
	{
		return this.videoService.getVideo(id);
	}

	@PostMapping("/videos")
	public CreateVideoResponse addVideo(@RequestBody CreateVideoRequest request)
	{
		Video video = this.modelMapper.map(request, Video.class);
		video = this.videoService.addVideo(video);
		return this.modelMapper.map(video, CreateVideoResponse.class);
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
