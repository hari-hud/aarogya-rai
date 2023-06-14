package in.aarogyarai;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.Arrays;

import in.aarogyarai.repository.VideoRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import in.aarogyarai.models.Video;
import in.aarogyarai.services.VideoService;

@RunWith(SpringRunner.class)
@WebMvcTest
class VideoControllerMvcTest {
	
	private static final String CONTEXT_PATH = "/api";
	private static final String VIDEO_URL = "/api/video";
	private long VideoId = 0;
	private String VideoURL = "https://sleep.com";
	private String VideoDesc = "desc";
	private String VideoTitle = "title";
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private VideoService videoService;

	@MockBean
	private VideoRepository repository;

	@Test
	void testGetVideos() throws Exception {
		Video video = buildVideo();
		List<Video> videos = Arrays.asList(video);
		when(videoService.getVideos()).thenReturn(videos);
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		mockMvc.perform(get(VIDEO_URL).contextPath(CONTEXT_PATH))
				.andExpect(status().isOk())
				.andExpect(content().json(objectWriter.writeValueAsString(videos)));
		
	}

	@Test
	void testCreateVideo() throws Exception {
		Video video = buildVideo();
		when(videoService.addVideo(any())).thenReturn(video);
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		mockMvc.perform(post(VIDEO_URL).contextPath(CONTEXT_PATH).contentType(MediaType.APPLICATION_JSON)
						.content(objectWriter.writeValueAsString(video)))
				.andExpect(status().isOk())
				.andExpect(content().json(objectWriter.writeValueAsString(video)));
	}

	@Test
	void testUpdateVideo() throws Exception {
		Video video = buildVideo();
		when(videoService.updateVideo(any())).thenReturn(video);
		ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		mockMvc.perform(put(VIDEO_URL).contextPath(CONTEXT_PATH).contentType(MediaType.APPLICATION_JSON)
						.content(objectWriter.writeValueAsString(video)))
				.andExpect(status().isOk())
				.andExpect(content().json(objectWriter.writeValueAsString(video)));
	}

	@Test
	void testDeleteVideo() throws Exception {
		Video video = buildVideo();
		doNothing().when(repository).deleteById(VideoId);
		mockMvc.perform(delete(VIDEO_URL + VideoId).contextPath(CONTEXT_PATH)).andExpect(status().isOk());
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
