package lab4.bonus1.strategy2;

/**
 * MidtermExam inherits from Exam.
 * MidtermExam class is made final to prevent any further inheritance
 * We override equals in the subclass now
 */
final public class MidtermExam extends Exam {
    private int bonusPoint;

    public MidtermExam(String course, int score, int bonusPoint) {
        super(course, score);
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
        // boolean comp = this.accountNumber.equals(ba.accountNumber) &&
        // this.interestRate == ba.interestRate;
        boolean comp = midtermExam.getCourse().equals(this.getCourse()) && midtermExam.getScore() == this.getScore()
                && midtermExam.bonusPoint == this.bonusPoint;
        return comp;
    }

}
