package com.link.girl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service
 *
 * @author link
 * @create 2018-04-11-0:30
 */
@Service
public class GrilService {
    @Autowired
    private GirlJpaRepository girlJpaRepository;

    public  void saveTwo(){

        Girl girl =new Girl();
        girl.setAge(11);
        girl.setCupSize("B");
        girlJpaRepository.save(girl);



        Girl girl2 =new Girl();
        girl2.setAge(23);
        girl2.setCupSize("C");
        girlJpaRepository.save(girl2);

    }
}
