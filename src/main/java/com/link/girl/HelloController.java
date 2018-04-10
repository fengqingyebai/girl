package com.link.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: link
 * Date: 2018/4/9
 * Time: 20:28
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class HelloController {

  /*  @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello spring boot !";
    }*/
@Autowired
  private GirlProperties girlProperties;


//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
  @RequestMapping(value = "/hello/{id}")
    public String say(@PathVariable("id")Integer id) {
        return "id:"+id;
    }


  @RequestMapping(value = "/hello2")
  public String say2(@RequestParam("id")Integer myId) {
    return "myId:"+myId;
  }

  //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//  @GetMapping(value = "/hello")
//  public String say() {
//    return girlProperties.getCupSize();
//  }

//  @RequestMapping(value = "/hello", method = RequestMethod.GET)
//  public String say() {
//    return "index";
//  }

}
