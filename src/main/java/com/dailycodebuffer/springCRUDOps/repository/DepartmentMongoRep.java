package com.dailycodebuffer.springCRUDOps.repository;

import com.dailycodebuffer.springCRUDOps.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentMongoRep extends MongoRepository<Department, Long>{
    Department findByName(String name);
}
