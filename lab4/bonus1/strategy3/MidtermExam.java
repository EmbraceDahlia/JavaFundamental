package lab4.bonus1.strategy3;

/**
 * MidtermExam is a normal class, no inheritance
 * MidtermExam has an instance variable of type Exam
 */
public class MidtermExam {
    private Exam exam;
    private int bonusPoint;

    public MidtermExam(String course, int score, int bonusPoint) {
        exam = new Exam(course, score);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public boolean equals(Object ob) {
        // Null check
        if ((ob == null))
            return false;

        // Class check
        if (getClass() != ob.getClass())
            return false;

        MidtermExam midtermExam = (MidtermExam) ob;
        boolean comp = midtermExam.exam.equals(exam) && midtermExam.bonusPoint == this.bonusPoint;
        return comp;
    }

}
