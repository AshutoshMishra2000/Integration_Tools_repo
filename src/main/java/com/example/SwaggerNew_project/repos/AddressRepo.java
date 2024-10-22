package com.example.SwaggerNew_project.repos;

import com.example.SwaggerNew_project.entities.AddressTbl;
import com.example.SwaggerNew_project.entities.AddressTblPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<AddressTbl, AddressTblPK> {
}
