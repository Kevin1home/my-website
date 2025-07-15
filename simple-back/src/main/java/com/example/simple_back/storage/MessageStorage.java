package com.example.simple_back.storage;

import com.example.simple_back.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageStorage extends JpaRepository<Message, Long> {

}
