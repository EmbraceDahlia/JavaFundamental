package lab4.bonus1;

public class Homework {

    private String labTitle;
    private int score;

    public Homework(String labTitle, int score) {
        this.labTitle = labTitle;
        this.score = score;
    }

    public String getLabTitle() {
        return labTitle;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (getClass() != ob.getClass()) return false;
        Homework h = (Homework) ob;
        return h.labTitle.equals(labTitle) && h.score == score;
    }
}
