
package com.coderbd.learn.eduQualification;


public class EduQualification {
    private int id;
    private Exam exam;
    private Session session;
    private Board board;
    private Group group;
    private PassingYear passinYear;
    private CGPA cgpa;

    public EduQualification(int id, Exam exam, Session session, Board board, Group group, PassingYear passinYear, CGPA cgpa) {
        this.id = id;
        this.exam = exam;
        this.session = session;
        this.board = board;
        this.group = group;
        this.passinYear = passinYear;
        this.cgpa = cgpa;
    }
    
    
    
    
}
