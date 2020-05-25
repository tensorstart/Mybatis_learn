package MybatisMod.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:MybatisUtils
 * Package:Mybatis.utils
 * Discription:Mybatis的工具类
 *
 * @Data:2020/5/23 11:50
 */
public class MybatisUtils {
    static SqlSessionFactory factory=null;
    static {
        String config="Mybatis.xml";//读取配置文件
        try {
            InputStream ism = Resources.getResourceAsStream(config);
//            创建SqlSessionFactory对象
            factory=  new SqlSessionFactoryBuilder().build(ism);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    获取sqlSession的方法
    public static SqlSession getSqlSession(){
        SqlSession sqlSession =null;
        if (factory!=null){
            sqlSession=factory.openSession();
        }
        return sqlSession;

    }
}
