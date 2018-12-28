package com.jubayir.controller;

import com.jubayir.entity.Privilize;
import com.jubayir.entity.Role;
import com.jubayir.repo.PrivilizeRepo;
import com.jubayir.repo.RoleRepo;
import com.jubayir.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Controller
@RequestMapping(value = "/role/")
public class RoleController {
    @Autowired
    private RoleService service;
    @Autowired
    PrivilizeRepo privilizeRepo;

    @Autowired
    private RoleRepo repo;

    @GetMapping(value = "create.jsf")
    public String displayRole(Model model) {
        model.addAttribute("obj", new Role());
        return "role/create";

    }

    @PostMapping(value = "create.jsf")
    public String saveRole(@Valid Role obj, BindingResult result, Model model) {
        if (obj != null){
            repo.save(obj);
            model.addAttribute("successMsg", "Success");
            model.addAttribute("obj", new Role());
        }

        return "role/create";

    }

    @GetMapping(value = "list.jsf")
    public String getRoleList(Model model) {
        model.addAttribute("list", repo.findAll());
        return "role/list";

    }
}
