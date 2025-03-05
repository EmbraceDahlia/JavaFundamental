package lab4.bonus1.strategy1;

import lab4.bonus1.Grade;

import java.time.LocalDate;

public class FinalExam extends Exam {
    private Grade grade;

    public FinalExam(String examContent, LocalDate dateAdministered, double score, Grade grade) {
        super(examContent, dateAdministered, score);
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public double computeScore() {
        return super.computeScore() * 0.45;
    }

//    @Override
//    public boolean equals(Object ob) {
//        if (ob == null) return false;
//        if (getClass() != ob.getClass()) return false;
//        FinalExam fe = (FinalExam) ob;
//        return fe.getExamContent().equals(getExamContent()) &&
//                fe.getDateAdministered().equals(getDateAdministered()) &&
//                fe.computeScore() == computeScore() &&
//                fe.grade == grade;
//    }
}
