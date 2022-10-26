package mao.swagger_demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Project name(项目名称)：swagger_demo
 * Package(包名): mao.swagger_demo.entity
 * Class(类名): Menu
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/26
 * Time(创建时间)： 20:34
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@ApiModel(description = "菜单实体类")
public class Menu
{
    /**
     * id
     */
    @ApiModelProperty(value = "主键")
    private long id;

    /**
     * 名字
     */
    @ApiModelProperty(value = "菜单名称")
    private String name;

    /**
     * 类型
     */
    @ApiModelProperty(value = "菜单的类型，如果为0，则为有子菜单的菜单，如果为1，则为没有子菜单的菜单项")
    private int type;

    /**
     * 子菜单
     */
    @ApiModelProperty(value = "子菜单，如果当前为菜单项，则此字段的值为null")
    private Menu subMenu;

    /**
     * Instantiates a new Menu.
     */
    public Menu()
    {
    }

    /**
     * Instantiates a new Menu.
     *
     * @param id      the id
     * @param name    the name
     * @param type    the type
     * @param subMenu the sub menu
     */
    public Menu(long id, String name, int type, Menu subMenu)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.subMenu = subMenu;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public int getType()
    {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(int type)
    {
        this.type = type;
    }

    /**
     * Gets sub menu.
     *
     * @return the sub menu
     */
    public Menu getSubMenu()
    {
        return subMenu;
    }

    /**
     * Sets sub menu.
     *
     * @param subMenu the sub menu
     */
    public void setSubMenu(Menu subMenu)
    {
        this.subMenu = subMenu;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("id：").append(id).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("type：").append(type).append('\n');
        stringbuilder.append("subMenu：").append(subMenu).append('\n');
        return stringbuilder.toString();
    }
}
