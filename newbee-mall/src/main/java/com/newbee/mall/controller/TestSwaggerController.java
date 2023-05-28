package com.newbee.mall.controller;

import com.newbee.mall.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.*;


/**
 * @ClassName TestSwaggerController
 * @Description TODO
 * @Author Administrator
 * @Date 2023/5/26 23:01
 **/
@RestController
public class TestSwaggerController {
    static Map<Integer, User> usersMap = Collections.synchronizedMap(new HashMap<Integer, User>());

    //    初始化UsersMap
    static {
        User user = new User();
        user.setId(1);
        user.setName("newbee1");
        user.setPassword("111111");
        User user2 = new User();
        user2.setId(2);
        user2.setName("newbee2");
        user2.setPassword("222222");
        usersMap.put(1, user);
        usersMap.put(2, user2);
    }

    @ApiOperation(value = "获取用户列表", notes = "获取所有的用户")
    @GetMapping("/users")
    public List<User> getUserList() {
        List<User> users = new ArrayList<>(usersMap.values());
        return users;
    }

    @ApiOperation(value = "新增用户", notes = "根据User对象新增用户")
    @PostMapping("/users")
    public String postUser(@RequestBody User user) {
        usersMap.put(user.getId(), user);
        return "新增成功";
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据id获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "int")
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id) {
        return usersMap.get(id);
    }

    @ApiOperation(value = "更新用户信息", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户Id", required = true, dataType = "int"),
            @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    })
    @PutMapping("/users/{id}")
    public String putUser(@PathVariable Integer id, @RequestBody User user) {
        User user1 = usersMap.get(id);
        user1.setName(user.getName());
        user1.setPassword(user.getPassword());
        usersMap.put(id, user1);
        return "更新成功";
    }

    @ApiOperation(value = "根据id删除指定用户", notes = "")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "int")
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Integer id) {
        usersMap.remove(id);
        return "删除成功";
    }
}
