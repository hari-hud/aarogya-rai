package in.aarogyarai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.aarogyarai.models.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

}
