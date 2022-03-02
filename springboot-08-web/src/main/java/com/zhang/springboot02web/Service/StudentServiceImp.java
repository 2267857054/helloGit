package com.zhang.springboot02web.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.springboot02web.Bean.Student;
import com.zhang.springboot02web.Dao.StudentMapper;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImp  extends ServiceImpl<StudentMapper,Student> implements StudentService{

}
