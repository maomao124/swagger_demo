package mao.swagger_demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：swagger_demo
 * Package(包名): mao.swagger_demo.controller
 * Class(类名): StudentController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/26
 * Time(创建时间)： 21:12
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
@RequestMapping("/student")
@Api(tags = "学生控制器")
public class StudentController
{
    @GetMapping("/{pageNum}/{pageSize}")
    @ApiOperation(value = "分页查询学生的信息", notes = "分页查询学生的信息")
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
        return "ok";
    }
}
