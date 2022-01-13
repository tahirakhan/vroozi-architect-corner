package com.vrooziks.university.service;

import com.vrooziks.university.client.StudentClient;
import com.vrooziks.university.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
@RefreshScope
@Service
public class UniversityService {
    @Value("${university-name}")
    String univName;
    @Value("${address}")
    String address;
    @Autowired
    StudentClient client;
    public University getUniversityMessage() {
        University obj = new University();
        obj.setMessage(client.helloWorld());
        obj.setName(univName);
        obj.setAddress(address);
        return  obj;
    }
}
