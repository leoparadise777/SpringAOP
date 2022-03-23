package com.example.springaop.controller;

import com.example.springaop.model.Department;
import com.example.springaop.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.websocket.server.PathParam;

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department save (@RequestBody Department department){
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findById (@PathVariable(value = "id") Integer id){
        return departmentService.findById(id);
    }

}
