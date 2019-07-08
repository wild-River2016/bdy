package com.lsh.compare;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName CompareTest
 * @Description: TODO
 * @Author lsh
 * @Date 2019/6/14 10:08
 * @Version
 */
public class CompareTest {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"jj"));
        students.add(new Student(0,"ww"));
        students.add(new Student(0,"kk"));
        students.add(new Student(2,"ll"));

        Collections.sort(students);
        System.out.println(students);




    }
}
