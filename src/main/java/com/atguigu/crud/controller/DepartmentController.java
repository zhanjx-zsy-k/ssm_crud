package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author k
 * @create 2021-09-14 22:07
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @ResponseBody
    @RequestMapping("/depts")
    public Msg getDepts(){
        List<Department> list = departmentService.getDepts();
        return  Msg.success().add("depts",list);
    }

}
