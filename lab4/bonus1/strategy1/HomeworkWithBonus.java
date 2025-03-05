package lab4.bonus1.strategy1;

public class HomeworkWithBonus extends Homework {
    private int bonusPoint;

    public HomeworkWithBonus(String labTitle, int score, int bonusPoint) {
        super(labTitle, score);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
