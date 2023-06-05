package co.in.wellth.services;

import java.util.List;

import co.in.wellth.models.Video;


public interface IVideoService {
	public List<Video> getVideos();
	public Video getVideo(long id);
	public Video addVideo(Video video);
	public Video updateVideo(Video video);
	public void deleteVideo(long id);
}
