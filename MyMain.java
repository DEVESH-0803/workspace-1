package com.college;
import com.college.student.MyStudent;
import com.college.student.studentdetails.*;
import com.college.teacher.*;
import com.college.teacher.teacherdetails.*;

public class MyMain {
    
    public static void main(String[] args) {
    
    System.out.println("I am Main");

MyStudent ms = new MyStudent();
ms.print();

StudentDetails sd = new StudentDetails();
sd.print();

MyTeacher mt = new MyTeacher();
mt.print();

TeacherDetails td = new TeacherDetails();
td.print();


    }
}