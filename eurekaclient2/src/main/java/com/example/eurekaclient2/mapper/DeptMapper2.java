package com.example.eurekaclient2.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.eurekaclient2.entity.DeptEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//mapper上面未使用@Mapper注解，是因为在入口类中增加了注解@MapperScan注解。
@Mapper
@Repository
public interface DeptMapper2 extends BaseMapper<DeptEntity> {

    @Select("select * from t_dept where id = #{id}")
    DeptEntity queryById(@Param("id") Integer di);

    @Select("select * from t_dept")
    List<DeptEntity> queryAll();

    @Insert("insert into t_dept(id, dept_name, dept_content) values (#{id}, #{deptName}, #{deptContent})")
    Integer add(DeptEntity deptEntity);
}
