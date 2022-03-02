package com.zhang.springboot02web.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhang.springboot02web.Bean.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentMapper extends BaseMapper <Student>{
//    @Select(" select * from city where id=#{id}")
//  publicStudent selectStudentByID(Integer id);
}
