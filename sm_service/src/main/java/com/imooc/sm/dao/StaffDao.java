package com.imooc.sm.dao;

import com.imooc.sm.entity.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("staffDao")
public interface StaffDao {
    void insert(Staff department);
    void delete(Integer id);
    void update(Staff department);
    Staff selectById(Integer id);
    List<Staff> selectAll();
}
