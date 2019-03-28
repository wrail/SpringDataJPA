package com.wrial.demo.domain;

import lombok.Data;

import javax.persistence.*;


//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "spring_data") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
@Data
public class Person {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name = "username", length = 50) //这是和数据表对应的一个列
    private String username;

    @Column(name = "password", length = 50) //这是和数据表对应的一个列
    private String password;

}