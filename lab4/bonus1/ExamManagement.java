package lab4.bonus1;

import lab4.bonus1.strategy1.Exam;
import lab4.bonus1.strategy1.MidtermExam;
import lab4.bonus1.strategy1.QuizExam;
import lab4.bonus1.strategy2.Homework;
import lab4.bonus1.strategy2.HomeworkWithBonus;
import lab4.bonus1.strategy3.FinalExamWithQuiz;

import java.time.LocalDate;

public class ExamManagement {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        //Strategy 1 -> It's OK to be the same for Exam and QuizExam
        Exam e = new Exam("Lesson 1 to 4",now,10);
        Exam e2 = new QuizExam("Lesson 1 to 4",now,10,20);
        System.out.println(e.equals(e2));
        Exam e3 =new Exam("Lesson 1 to 5",now,100);
        Exam e4 =new MidtermExam("Lesson 1 to 6",now,100,70);
        System.out.println(e3.equals(e4));

        //Strategy 2
        Homework h1 = new Homework("Lab4",20);
        Homework h2 = new Homework("Lab4",20);
        Homework h3 = new Homework("Lab5",30);
        System.out.println(h1.equals(h2));
        System.out.println(h2.equals(h3));

        HomeworkWithBonus hb1 = new HomeworkWithBonus("Lab4",20,5);
        HomeworkWithBonus hb2 = new HomeworkWithBonus("Lab4",20,5);
        System.out.println(hb1.equals(hb2));
        System.out.println(hb1.equals(h1));

        //Strategy 3
        FinalExamWithQuiz s1 = new FinalExamWithQuiz("Lesson 1 to 4",now,20,20,Grade.A);
        FinalExamWithQuiz s2 = new FinalExamWithQuiz("Lesson 1 to 4",now,20,20,Grade.A);
        FinalExamWithQuiz s3 = new FinalExamWithQuiz("Lesson 1 to 4",now,20,20,Grade.C);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
