package lab4.bonus1.strategy2;

/***
 * Strategy 2
 * Same class strategy
 * In this strategy, both the child class and parent class are equipped with
 * different implementations(overrides) of the equals method
 * We check for the classes being the same
 * We also check for the instance field values in both classes
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

        // Class check
        if (getClass() != ob.getClass())
            return false;

        // Instance fields check
        Exam exam = (Exam) ob;
        return exam.course.equals(course) && exam.score == score;
    }
}
