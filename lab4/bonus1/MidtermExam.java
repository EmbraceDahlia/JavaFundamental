package lab4.bonus1;

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
        MidtermExam me = (MidtermExam) ob;
        return me.getExamContent().equals(getExamContent()) &&
                me.getDateAdministered().equals(getDateAdministered()) &&
                me.computeScore() == computeScore() &&
                me.passingScore == passingScore;
    }
}
