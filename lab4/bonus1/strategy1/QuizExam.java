package lab4.bonus1.strategy1;

import java.time.LocalDate;

public class QuizExam extends Exam {
    private int noOfQuestion;

    public QuizExam(String examContent, LocalDate dateAdministered, double score, int noOfQuestion) {
        super(examContent, dateAdministered, score);
        this.noOfQuestion = noOfQuestion;
    }

    public int getNoOfQuestion() {
        return noOfQuestion;
    }

    @Override
    public double computeScore() {
        return super.computeScore() * 0.15;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (getClass() != ob.getClass()) return false;
        QuizExam qe = (QuizExam) ob;
        return qe.getExamContent().equals(getExamContent()) &&
                qe.getDateAdministered().equals(getDateAdministered()) &&
                qe.computeScore() == computeScore() &&
                qe.noOfQuestion == noOfQuestion;
    }
}
