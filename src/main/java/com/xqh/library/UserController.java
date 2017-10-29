package com.xqh.library;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    /** 访问 register的方式
    curl -H "Content-Type: application/json" -X POST -d '{
"userId":"111",
"username":"cgl",
"password":"11111",
"tel":"13064570402",
"email":"shcaoguilin@163.com",
"age":30,
"sex":"true"
}' http://10.1.2.103:8080/register
     */

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public boolean register(@RequestBody  User user){
        return true;
    }


    //  访问longin的方式  http://10.1.2.103:8080/login?unm=xuqiaohong&pwd=123
    @RequestMapping("/login")
    public User login(@RequestParam("unm") String username,@RequestParam("pwd") String password){
        return null;
    }

//  访问query的方式  http://10.1.2.103:8080/query?uid=666

    @RequestMapping("/query")
    public User query(@RequestParam("uid") int userId){
        return null;
    }
}
