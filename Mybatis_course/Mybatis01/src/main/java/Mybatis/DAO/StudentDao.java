package Mybatis.DAO;

import Mybatis.Domain.student;

import java.util.List;

/**
 * ClassName:StudentDao
 * Package:Mybatis.DAO
 * Discription:操作student表
 *
 * @Data:2020/5/22 22:20
 */
public interface StudentDao {
//    查询student表的所有数据
    public List<student> selectStudents();
    //插入方法
    public int insertStudent(student stu);

}
