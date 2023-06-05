package co.in.wellth.controller;

import in.aarogyarai.pojo.CreateVideoRequest;

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
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
//@RequestMapping("/api")
@Tag(name = "Videos")
public class VideoController {
	
	@Autowired
	IVideoService videoService;
	
	// @RequestMapping( value = "/educations", method = RequestMethod.GET)
	@GetMapping("/videos")
	//@Hidden // hides api endpoint from swagger ui
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
	public Video addVideo(@RequestBody CreateVideoRequest request)
	{
		Video video = new Video();
		video.setTitle(request.getTitle());
		video.setDetails(request.getDescription());
		return this.videoService.addVideo(video);
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
