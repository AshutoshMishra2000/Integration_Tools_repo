package com.example.SwaggerNew_project.repos;

import com.example.SwaggerNew_project.entities.ParentsTbl;
import com.example.SwaggerNew_project.entities.ParentsTblPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentsRepo extends JpaRepository<ParentsTbl, ParentsTblPK> {
}
