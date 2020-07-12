package com.fubic.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//Dept实体类
//orm泪飙关系映射
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;

    //一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

/*    链式写法：
    Dept dept = new Dept();
    dept.setDeptNo(11）.setDname('人事部');
    */
}
