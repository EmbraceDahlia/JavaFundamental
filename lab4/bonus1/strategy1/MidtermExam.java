package lab4.bonus1.strategy1;

/**
 * MidtermExam inherits from Exam.
 * With strategy1 no need to override equals in child class
 */
public class MidtermExam extends Exam {
    private int bonusPoint;

    public MidtermExam(String course, int score, int bonusPoint) {
        super(course, score);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
