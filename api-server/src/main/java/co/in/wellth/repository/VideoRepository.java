package co.in.wellth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.in.wellth.models.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

}
