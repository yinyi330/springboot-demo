package com.yinyispringbootdemo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2022-08-06 19:53:29
 */
@SuppressWarnings("serial")
@Data
public class User extends Model<User> {

    @TableId(type= IdType.AUTO,value = "id")
    private Integer id;

    private String name;

    private Integer age;

    private Integer sex;

    private String address;

    private String useflag;

    private Date inserttime;

    private Date updatetime;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

