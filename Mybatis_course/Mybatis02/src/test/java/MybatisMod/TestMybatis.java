package MybatisMod;

import MybatisMod.DAO.Impl.StudentDaoImpl;
import MybatisMod.DAO.StudentDao;
import MybatisMod.DoMain.Student;
import org.junit.Test;

import java.util.List;

/**
 * ClassName:TestMybatis
 * Package:MybatisMod
 * Discription:
 *
 * @Data:2020/5/23 17:58
 */
public class TestMybatis {
    @Test
    public void TestDaoImpl(){
        StudentDao stu = new StudentDaoImpl();
        List<Student> list=stu.selectStudent();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
