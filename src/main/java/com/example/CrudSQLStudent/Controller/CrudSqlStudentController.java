package com.example.CrudSQLStudent.Controller;

import com.example.CrudSQLStudent.Model.CrudSqlmodel;
import com.example.CrudSQLStudent.Repository.CrudSqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudSqlStudentController {

    @Autowired
    CrudSqlRepository crudrepo;
    
    @PostMapping(path = "/student")
    public CrudSqlmodel saveStudent(@RequestBody CrudSqlmodel crudSqlmodel){
        crudrepo.save(crudSqlmodel);
        return crudSqlmodel;
    }

    @GetMapping(path = "/students")
    public List<CrudSqlmodel> dispAllStudents(){
        return crudrepo.findAll();
    }

    @DeleteMapping(path = "/student/{sid}")
    public String deleteStudent(@PathVariable int sid, CrudSqlmodel crsqlmodel){
        crsqlmodel = crudrepo.getById(sid);
        crudrepo.delete(crsqlmodel);
        return "Deleted";
    }


}
