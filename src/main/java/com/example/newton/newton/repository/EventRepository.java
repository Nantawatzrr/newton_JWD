package com.example.newton.newton.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.newton.newton.model.Event;

public interface EventRepository extends CrudRepository <Event , Integer> {

}
