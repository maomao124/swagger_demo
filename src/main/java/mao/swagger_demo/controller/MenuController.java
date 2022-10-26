package mao.swagger_demo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Project name(项目名称)：swagger_demo
 * Package(包名): mao.swagger_demo.controller
 * Class(类名): MenuController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/26
 * Time(创建时间)： 21:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class MenuController
{
    @PostMapping("/save")
    @ApiOperation(value = "添加菜单", notes = "添加菜单")
    public String save()
    {
        return "OK";
    }

    @PutMapping("/update")
    @ApiOperation(value = "更新菜单", notes = "更新菜单")
    public String update()
    {
        return "OK";
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除菜单", notes = "删除菜单")
    @ApiImplicitParams
            (
                    @ApiImplicitParam(name = "id", value = "菜单的id", required = true, type = "long")
            )
    public String delete(long id)
    {
        return "OK";
    }


    @GetMapping(value = "page/{pageNum}/{pageSize}")
    @ApiOperation(value = "分页查询", notes = "分页查询菜单信息")
    @ApiImplicitParams
            (
                    {
                            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, type = "Integer"),
                            @ApiImplicitParam(name = "pageSize", value = "每页能显示的条数", required = true, type = "Integer")
                    }
            )
    public String findByPage(@PathVariable Integer pageNum,
                             @PathVariable Integer pageSize)
    {
        return "OK";
    }
}
