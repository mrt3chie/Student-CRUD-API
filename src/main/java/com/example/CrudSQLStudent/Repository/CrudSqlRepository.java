package com.example.CrudSQLStudent.Repository;

import com.example.CrudSQLStudent.Model.CrudSqlmodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudSqlRepository extends JpaRepository<CrudSqlmodel, Integer> {
}
