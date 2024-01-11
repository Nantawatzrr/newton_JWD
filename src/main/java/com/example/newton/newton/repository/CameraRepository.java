package com.example.newton.newton.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.newton.newton.model.Camera;

public interface CameraRepository extends CrudRepository <Camera , Integer> {
    
    List<Camera> findByIpaddress(String ipaddress);
    List<Camera> findByLocationContaining(String location);
}
