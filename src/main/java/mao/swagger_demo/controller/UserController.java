package mao.swagger_demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import mao.swagger_demo.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：swagger_demo
 * Package(包名): mao.swagger_demo.controller
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/26
 * Time(创建时间)： 20:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Api(tags = "用户控制器")
@RestController
@RequestMapping("/user")
public class UserController
{
    @GetMapping("/{id}")
    @ApiOperation(value = "根据用户id查询用户", notes = "根据用户id查询用户")
    @ApiImplicitParams
            (
                    @ApiImplicitParam(name = "id", value = "用户的id", required = true, type = "long")
            )
    public User getUser(@PathVariable long id)
    {
        return new User(id, "张三", "1234");
    }

    @GetMapping
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户的信息")
    public List<User> getAll()
    {
        List<User> list = new ArrayList<>(3);
        list.add(new User(1, "张三", "1234"));
        list.add(new User(2, "张三", "1234"));
        list.add(new User(3, "张三", "1234"));
        return list;
    }

    @PostMapping("")
    @ApiOperation(value = "保存(添加)用户的信息", notes = "保存(添加)用户的信息")
    public String saveUser()
    {
        return "ok";
    }

    @PutMapping
    @ApiOperation(value = "更新用户信息", notes = "更新用户信息")
    public String updateUser()
    {
        return "ok";
    }

    @DeleteMapping
    @ApiOperation(value = "删除用户的信息", notes = "删除用户的信息")
    public String deleteUser()
    {
        return "ok";
    }
}
