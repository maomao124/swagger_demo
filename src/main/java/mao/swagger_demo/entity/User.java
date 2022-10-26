package mao.swagger_demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Project name(项目名称)：swagger_demo
 * Package(包名): mao.swagger_demo.entity
 * Class(类名): User
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/26
 * Time(创建时间)： 20:19
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@ApiModel(description = "用户实体类")
public class User
{
    /**
     * id
     */
    @ApiModelProperty(value = "id，主键")
    private long id;

    /**
     * 名字
     */
    @ApiModelProperty(value = "用户的名字或者昵称")
    private String name;

    /**
     * 密码
     */
    @ApiModelProperty(value = "用户的密码")
    private String password;


    public User()
    {
    }

    public User(long id, String name, String password)
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("password：").append(password).append('\n');
        return stringbuilder.toString();
    }
}
