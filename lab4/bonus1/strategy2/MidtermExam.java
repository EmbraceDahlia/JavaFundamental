package lab4.bonus1.strategy2;

import java.time.LocalDate;

public class MidtermExam extends Exam {
    private int passingScore;

    public MidtermExam(String examContent, LocalDate dateAdministered, double score, int passingScore) {
        super(examContent, dateAdministered, score);
        this.passingScore = passingScore;
    }

    public int getPassingScore() {
        return passingScore;
    }

    @Override
    public double computeScore() {
        return super.computeScore() * 0.4;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (getClass() != ob.getClass()) return false;
        MidtermExam p = (MidtermExam) ob;
        return p.getExamContent().equals(getExamContent()) &&
                p.getDateAdministered().equals(getDateAdministered()) &&
                p.computeScore() == computeScore() &&
                p.passingScore == passingScore;
    }
}
