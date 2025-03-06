package lab4.bonus1.strategy1;

/***
 * Strategy 1
 * Instance of strategy
 * In this strategy, equals is considered enough if 2 instances of an object in
 * this case it will be Exam object are of the same instance
 * This strategy proceeds to check for instance fields if they have the same
 * values.
 * Equals method is only implemented in the parent class
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
