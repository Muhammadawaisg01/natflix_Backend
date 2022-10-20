package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import models.Content;


public interface ContentRepository extends JpaRepository<Content, Integer> {

}
