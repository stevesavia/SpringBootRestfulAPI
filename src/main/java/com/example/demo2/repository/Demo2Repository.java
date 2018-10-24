package com.example.demo2.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo2.model.Note;


@Repository
public interface Demo2Repository extends JpaRepository<Note, Long> {
}
