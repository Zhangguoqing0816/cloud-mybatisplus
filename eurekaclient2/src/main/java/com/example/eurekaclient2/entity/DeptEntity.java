package com.example.eurekaclient2.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@TableName("t_dept")
@Data
@Entity
@Table(name = "t_dept")
public class DeptEntity {

    @TableId(value = "id", type = IdType.INPUT)
    @Id
    private String id;

    //@TableField("user_name")
    private String deptName;

    private String deptContent;
}
