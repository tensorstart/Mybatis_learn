package MybatisMod.DAO;

import MybatisMod.DoMain.Student;

import java.util.List;

/**
 * ClassName:StudentDao
 * Package:MybatisMod.DAO
 * Discription:
 *
 * @Data:2020/5/23 17:22
 */
public interface StudentDao {
    public List<Student> selectStudent();
}
