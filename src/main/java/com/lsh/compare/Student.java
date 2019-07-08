package com.lsh.compare;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author lsh
 * @Date 2019/6/14 10:11
 * @Version
 */
public class Student implements Comparable {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}' + '\n';
    }

    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        int result = st.age > age ? 1 : (st.age == age ? 0 : -1);
        if (result == 0) {
            result = st.name.indexOf(0) > name.indexOf(0) ? 1 : -1;
        }
        return result;
    }
}
