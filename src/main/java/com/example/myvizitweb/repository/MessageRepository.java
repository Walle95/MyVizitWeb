package com.example.myvizitweb.repository;

import com.example.myvizitweb.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {
}
