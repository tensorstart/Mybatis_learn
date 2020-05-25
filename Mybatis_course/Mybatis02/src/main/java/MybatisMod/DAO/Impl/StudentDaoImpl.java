package MybatisMod.DAO.Impl;

import MybatisMod.DAO.StudentDao;
import MybatisMod.DoMain.Student;
import MybatisMod.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * ClassName:StudentDaoImpl
 * Package:MybatisMod.DAO.Impl
 * Discription:
 *
 * @Data:2020/5/23 17:53
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudent() {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        String SQLid="MybatisMod.DAO.StudentDao.selectStudent";
        List<Student> stu = sqlSession.selectList(SQLid);
        sqlSession.close();
        return stu;
    }
}
