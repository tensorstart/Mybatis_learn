package Mybatis;

import Mybatis.Domain.student;
import Mybatis.utils.MybatisUtils;
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
 * Discription:使用工具类简化代码
 *
 * @Data:2020/5/22 23:51
 */
public class MyApp2 {
    public static void main(String[] args) throws IOException {
        //定义Mybatis主配置文件名称

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String sqlID="Mybatis.DAO.StudentDao"+"."+"selectStudents";
        List<student> stu = sqlSession.selectList(sqlID);
        for (student student : stu) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
