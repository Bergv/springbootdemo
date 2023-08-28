package com.botech.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity //标识实体
@Table(name = "student")
@Data
public class Student implements Serializable {
    @Id //ID列标识
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
    @Column(name = "id", length = 20, nullable = false)//列定义
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "sex", length = 1, nullable = false)
    private int sex;

    @Column(name = "phone", length = 11, nullable = false)
    private String phone;
}
