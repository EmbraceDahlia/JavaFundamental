package lab4.bonus1.strategy3;

/***
 * Strategy 3
 * Composition Based strategy
 * This strategy does not involve inheritance, we don't have to make our
 * subclass final
 * The requirement is handle
 */
public class Exam {
    private String course;
    private int score;

    public Exam(String course, int score) {
        this.course = course;
        this.score = score;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object ob) {
        // Null check
        if (ob == null)
            return false;

        // instance of check
        if (!(ob instanceof Exam))
            return false;

        // Instance fields check
        Exam exam = (Exam) ob;
        return exam.course.equals(course) && exam.score == score;
    }
}
