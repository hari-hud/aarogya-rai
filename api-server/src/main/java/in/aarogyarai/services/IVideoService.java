package in.aarogyarai.services;

import java.util.List;

import in.aarogyarai.models.Video;


public interface IVideoService {
	public List<Video> getVideos();
	public Video getVideo(long id);
	public Video addVideo(Video video);
	public Video updateVideo(Video video);
	public void deleteVideo(long id);
}
