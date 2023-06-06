package co.in.wellth;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import in.aarogyarai.models.Video;
import in.aarogyarai.services.VideoService;

@RunWith(SpringRunner.class)
@WebMvcTest
class VideoControllerMvcTest {
	
	private static final String CONTEXT_PATH = "/api/v1";
	private int VideoId = 0;
	private String VideoURL = "https://sleep.com";
	private String VideoDesc = "desc";
	private String VideoTitle = "title";
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private VideoService videoService;

	@Test
	void testGetVideos() throws Exception {
		Video video = buildVideo();
		List<Video> videos = Arrays.asList(video);
		when(videoService.getVideos()).thenReturn(videos);
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		mockMvc.perform(get("/api/v1/video").contextPath(CONTEXT_PATH))
				.andExpect(status().isOk())
				.andExpect(content().json(objectWriter.writeValueAsString(videos)));
		
	}

	private Video buildVideo() {
		Video video = new Video();
		video.setId(VideoId);
		video.setTitle(VideoTitle);
		video.setDetails(VideoDesc);
		video.setUrl(VideoURL);
		return video;
	}
}
