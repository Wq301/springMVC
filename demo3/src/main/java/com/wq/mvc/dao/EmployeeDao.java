package com.wq.mvc.dao;

import com.wq.mvc.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-10 21:17
 */

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees=null;

    static {
        employees=new HashMap<Integer, Employee>();

        employees.put(1001,new Employee(1001,"E-AA","aa@163.com",1));
        employees.put(1002,new Employee(1002,"E-BB","bb@163.com",1));
        employees.put(1003,new Employee(1003,"E-CC","cc@163.com",0));
        employees.put(1004,new Employee(1004,"E-DD","dd@163.com",0));
        employees.put(1005,new Employee(1005,"E-EE","ee@163.com",1));
    };

    private static Integer intiId=1006;

    //添加、修改员工
    public void save(Employee employee){
        if (employee.getId()==null){
            employee.setId(intiId++);
        }
        employees.put(employee.getId(),employee);
    }

    //查询所有员工
    public Collection<Employee> getAll(){
        return employees.values();
    }

    //根据id查询员工
    public Employee get(Integer id){
        return employees.get(id);
    }

    //根据id删除员工
    public void delete(Integer id){
        employees.remove(id);
    }
}