package lab4.bonus1.strategy2;

public class ExamTest {

    public static void main(String[] args) {
        Exam midterm1 = new MidtermExam("FPP", 100, 75);
        Exam midterm2 = new MidtermExam("FPP", 100, 60);

        /*
         * The check below returns false. This is because now midterm1 uses the equals
         * on the MidtermExam which checks all the instance fields, from the parent and
         * those in the subclass as well
         */
        System.out.println(midterm1.equals(midterm2));
    }

}
