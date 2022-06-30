package com.postgres.ops.model;
import javax.persistence.*;

@Entity
@Table(name = "student_table")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="student_regnum")
    private String studentRegNum;
    @Column(name="student_fname")
    private String studentFirstName;
    @Column(name="student_lname")
    private String studentLastName;
    @Column(name="student_grade")
    private Double studentGrade;
    
    public Students() {}

    public Students(String studentRegNum, String studentFirstName, String studentLastName, Double studentGrade) {
        this.studentRegNum = studentRegNum;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentGrade = studentGrade;
    }
    public long getId() {
        return id;
    }
    public String getStudentRegNum() {
        return studentRegNum;
    }
    public String getStudentFirstName() {
        return studentFirstName;
    }
    public String getStudentLastName() {
        return studentLastName;
    }
    public Double getStudentGrade() {
        return studentGrade;
    }

}
