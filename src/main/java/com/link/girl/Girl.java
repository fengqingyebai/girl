package com.link.girl;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: link
 * Date: 2018/4/10
 * Time: 21:31
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private  Integer id;
    private  Integer age;
    private  String cupSize;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
