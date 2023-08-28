package com.botech.dao;

import com.botech.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {
    //方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）
    List<Student> findByNameLike(String name);

    List<Student> findByNameLikeOrPhoneEquals(String name, String phone);

    @Query("FROM Student WHERE name LIKE :name")//HQL=Hibernate Query Language
    List<Student> getStudents(String name);

    @Query(value = "SELECT * FROM student WHERE name LIKE ?", nativeQuery = true)
    List<Student> searchStudents(String name);
}
