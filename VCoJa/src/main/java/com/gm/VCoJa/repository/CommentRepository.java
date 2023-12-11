package com.gm.VCoJa.repository;

import com.gm.VCoJa.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
