package lab4.bonus1.strategy2;

public class HomeworkWithBonus extends Homework {
    private int bonusPoint;

    public HomeworkWithBonus(String labTitle, int score, int bonusPoint) {
        super(labTitle, score);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (getClass() != ob.getClass()) return false;
        HomeworkWithBonus hb = (HomeworkWithBonus) ob;
        return hb.getLabTitle().equals(getLabTitle()) &&
                hb.getScore() == getScore() &&
                hb.bonusPoint == bonusPoint;
    }
}
