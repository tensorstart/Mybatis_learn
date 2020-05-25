package MybatisMod;

import MybatisMod.DAO.StudentDao;
import MybatisMod.DoMain.Student;
import MybatisMod.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
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
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao Dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = Dao.selectStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void TestDaoImpl2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentDao Dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = Dao.orderByStudent("name");
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
