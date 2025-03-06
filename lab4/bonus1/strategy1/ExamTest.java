package lab4.bonus1.strategy1;

public class ExamTest {

    public static void main(String[] args) {
        Exam midterm1 = new MidtermExam("FPP", 100, 75);
        Exam midterm2 = new MidtermExam("FPP", 100, 60);

        /*
         * The check below returns true. In the instance of strategy we are only.
         * And this would be okay if child classes do not have their own instance
         * fields. But now that we have inheritance at play, let us see how to solve
         * this for child classes in strategy 2
         */
        System.out.println(midterm1.equals(midterm2));
    }

}
