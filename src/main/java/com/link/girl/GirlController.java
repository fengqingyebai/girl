package com.link.girl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 控制器
 *
 * @author link
 * @create 2018-04-10-23:10
 */
@RestController
public class GirlController {

    @Autowired
    private GirlJpaRepository girlJpaRepository;

    @GetMapping(value = "/girls")
    public List<Girl> findAll(){
        return girlJpaRepository.findAll();
    }




}
