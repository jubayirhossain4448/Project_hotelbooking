package com.jubayir.service;

import com.jubayir.entity.Privilize;
import org.springframework.data.domain.Page;
import java.util.Optional;


public interface PrivilizeService {
    Privilize save(Privilize privilize);
    Privilize update(Privilize privilize);
    void delete(Long id);
    Optional<Privilize> getPrivilize(Long id);
    Page<Privilize> getAllPrivilizes(int page, int perPageRow);
    Privilize isAlreadyExist(String privilizeName);



}
