package com.hawking.mybatis.mapper;

import com.hawking.mybatis.bean.Employee;

public interface EmployeeMapper {
    Employee getEmpById(Integer id);
}
