package TestFun;

import Mybatis.Domain.student;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:TestMybatis
 * Package:TestFun
 * Discription:
 *
 * @Data:2020/5/23 10:41
 *
 */
public class TestMybatis {
    @Test
    public void TestInsert() throws IOException {
        String config="Mybatsi.xml";
        InputStream ism = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(ism);
        SqlSession sqlSession = factory.openSession();
        String sqlID="Mybatis.DAO.StudentDao.insertStudent";
        student stu=new student();
        stu.setAge(34);
        stu.setEmail("caocao@163.com");
        stu.setName("曹操");
        stu.setId(1005);

        int insert = sqlSession.insert(sqlID,stu);
        sqlSession.commit();
        System.out.println(insert);
        sqlSession.close();
    }
    @Test
    public void TestInsert1() throws IOException {
        //定义Mybatis主配置文件名称
        String config ="Mybatsi.xml";
        InputStream im = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(im);
        SqlSession sqlSession = build.openSession();
        String sqlID="Mybatis.DAO.StudentDao"+"."+"selectStudents";
        PageHelper.startPage(1,2);
        List<student> stu = sqlSession.selectList(sqlID);
        for (student student : stu) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
