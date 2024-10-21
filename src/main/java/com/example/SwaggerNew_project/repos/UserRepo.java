package com.example.SwaggerNew_project.repos;

import com.example.SwaggerNew_project.entities.UserTbl;
import com.example.SwaggerNew_project.entities.UserTblPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserTbl, UserTblPk> {

    List<UserTbl> findByUserTblPkUserId(String userId);
}
