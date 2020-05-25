package Mybatis.Domain;

/**
 * ClassName:student
 * Package:Mybatis.day01course
 * Discription:
 *
 * @Data:2020/5/22 22:12
 */
//推荐与表名一致
public class student {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer id;
    private String name;
    private String email;
    private Integer age;
}
