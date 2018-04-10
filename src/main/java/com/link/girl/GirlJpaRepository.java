package com.link.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * jpa接口
 *
 * @author link
 * @create 2018-04-10-23:11
 */
public interface GirlJpaRepository extends JpaRepository<Girl,Integer> {


    List<Girl> findAllByAge(Integer age);
}
