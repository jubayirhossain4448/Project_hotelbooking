package com.jubayir.serviceImpl;


import com.jubayir.entity.Role;
import com.jubayir.repo.RoleRepo;
import com.jubayir.service.PrivilizeService;
import com.jubayir.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepo repo;


    @Autowired
    private PrivilizeService privilizeService;
    @Override
    public Role save(Role role) {
        return repo.saveAndFlush(role);
    }

    @Override
    public Role update(Role role) {
        return repo.saveAndFlush(role);
    }

    @Override
    public void delete(Long id) {
repo.deleteById(id);
    }

    @Override
    public Optional<Role> getRole(Long id) {
        return repo.findById(id);
    }

    @Override
    public Page<Role> getAllRole(int page, int perPageRow) {
       return repo.findAll(PageRequest.of(page,perPageRow));
    }

    @Override
    public Role isAlreadyExist(String rolename) {
        return repo.findByRolename(rolename);
    }
}
