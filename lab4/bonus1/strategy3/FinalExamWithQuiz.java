package lab4.bonus1.strategy3;

import lab4.bonus1.Grade;
import lab4.bonus1.strategy1.QuizExam;

import java.time.LocalDate;

public class FinalExamWithQuiz {
    private QuizExam quizExam;
    private Grade grade;

    public FinalExamWithQuiz(String examContent, LocalDate dateAdministered, double score, int noOfQuestion, Grade grade) {
        this.quizExam = new QuizExam(examContent, dateAdministered, score, noOfQuestion);
        this.grade = grade;
    }

    public String getExamContent() {
        return quizExam.getExamContent();
    }

    public LocalDate getDateAdministered() {
        return quizExam.getDateAdministered();
    }

    public double getScore() {
        return quizExam.computeScore();
    }

    public int getNoOfQuestion() {
        return quizExam.getNoOfQuestion();
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (getClass() != ob.getClass()) return false;
        FinalExamWithQuiz p = (FinalExamWithQuiz) ob;
        return p.quizExam.equals(quizExam) && p.grade == grade;
    }
}
