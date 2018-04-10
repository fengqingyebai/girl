package com.link.girl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private GrilService grilService;

    @GetMapping(value = "/girls")
    public List<Girl> findAll(){
        return girlJpaRepository.findAll();
    }

    @PostMapping(value = "/girls/{id}")
    public Girl findGirl(@PathVariable("id")Integer id){
        return girlJpaRepository.findOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl updateGirl(@PathVariable("id")Integer id,@RequestParam("age")Integer age,@RequestParam("cupSize")String cupSize){

        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
       return  girlJpaRepository.save(girl);

    }



    @DeleteMapping(value = "/girls/{id}")
    public void updateGirl(@PathVariable("id")Integer id){
          girlJpaRepository.delete(id);
    }


    @GetMapping(value = "/girls/{age}")
    public List<Girl> findByAge(@PathVariable("age")Integer age){
       return girlJpaRepository.findAllByAge(age);
    }

    @GetMapping(value = "/girls/two")
    public void saveTwoGirls(){
         grilService.saveTwo();
    }

}
