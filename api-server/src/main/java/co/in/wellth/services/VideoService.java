package co.in.wellth.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.in.wellth.models.Video;
import co.in.wellth.repository.VideoRepository;

@Service
public class VideoService implements IVideoService {
	
	@Autowired
	private VideoRepository videoRepository;
	
	@Override
	public List<Video> getVideos() {
		return videoRepository.findAll();
	}

	@Override
	public Video getVideo(long id) {
		return videoRepository.findById(id).get();
	}

	@Override
	public Video addVideo(Video video) {
		return videoRepository.save(video);
	};

	@Override
	public Video updateVideo(Video video) {
		return videoRepository.save(video);
	}

	@Override
	public void deleteVideo(long id) {
		videoRepository.deleteById(id);
	}
}
