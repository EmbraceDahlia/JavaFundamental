package lab4.bonus1.strategy3;

public class ExamTest {

    public static void main(String[] args) {
        // Now creating MidtermExam objects
        MidtermExam midterm1 = new MidtermExam("FPP", 100, 75);
        MidtermExam midterm2 = new MidtermExam("FPP", 100, 60);

        /*
         * The check below returns false.
         * Checking that midterm1.exam is midterm2.exam and then checking instance field
         * bonusPoint
         */
        System.out.println(midterm1.equals(midterm2));
    }

}
