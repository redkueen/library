package com.xqh.library;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    /**
     * 用户注册
     * 访问 register的方式
     curl -H "Content-Type: application/json" -X POST -d '{
     "userId":"111",
     "username":"cgl",
     "password":"11111",
     "tel":"13064570402",
     "email":"shcaoguilin@163.com",
     "age":30,
     "sex":"true"
     }' http://10.1.2.103:8080/register
     * @param user  接收前端传递的数据
     * @return 注册成功时返回true，注册失败时返回false
     */
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public boolean register(@RequestBody  User user){
        return true;
    }

    /**
     * 用户登录
     * 访问longin的方式    http://10.1.2.103:8080/login?unm=xuqiaohong&pwd=123
     * @param username   接收用户登录时传递的数据（用户名）
     * @param password   接收用户登录时传递的数据（密码）
     * @return
     */
    @RequestMapping("/login")
    public User login(@RequestParam("unm") String username,@RequestParam("pwd") String password){
        return null;
    }

    /**
     * 用户查询
     * 访问query的方式  http://10.1.2.103:8080/query?uid=666
     * @param userId    接收查询时传递的用户id
     * @return
     */
    @RequestMapping("/query")
    public User query(@RequestParam("uid") int userId){
        return null;
    }
}
