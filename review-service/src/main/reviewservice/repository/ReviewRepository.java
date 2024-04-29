package main.reviewservice.repository;

import main.reviewservice.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Здесь могут быть определены дополнительные методы, если требуется специфичное поведение.
}