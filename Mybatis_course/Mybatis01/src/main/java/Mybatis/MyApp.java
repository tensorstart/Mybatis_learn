package Mybatis;

import Mybatis.Domain.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:MyApp
 * Package:Mybatis
 * Discription:
 *
 * @Data:2020/5/22 23:51
 */
public class MyApp {
    public static void main(String[] args) throws IOException {
        //定义Mybatis主配置文件名称
        String config ="Mybatsi.xml";
        InputStream im = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(im);
        SqlSession sqlSession = build.openSession();
        String sqlID="Mybatis.DAO.StudentDao"+"."+"selectStudents";
        List<student> stu = sqlSession.selectList(sqlID);
        for (student student : stu) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
