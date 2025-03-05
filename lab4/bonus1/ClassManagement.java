package lab4.bonus1;

import lab4.bonus1.strategy2.Exam;
import lab4.bonus1.strategy2.MidtermExam;
import lab4.bonus1.strategy2.QuizExam;
import lab4.bonus1.strategy1.Homework;
import lab4.bonus1.strategy1.HomeworkWithBonus;
import lab4.bonus1.strategy3.FinalExamWithQuiz;

import java.time.LocalDate;

public class ClassManagement {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        //Strategy 1
        Homework h1 = new Homework("Lab4",20);
        Homework h2 = new Homework("Lab4",20);
        Homework h3 = new Homework("Lab5",30);
        System.out.println("Strategy 1 checking homeworks are the same: " + h1.equals(h2));
        System.out.println("Strategy 1 checking homeworks are the same: " + h2.equals(h3));
        HomeworkWithBonus hb1 = new HomeworkWithBonus("Lab4",20,5);
        HomeworkWithBonus hb2 = new HomeworkWithBonus("Lab4",20,5);
        System.out.println("Strategy 1 checking homeworks with bonus are the same: " + hb1.equals(hb2));
        System.out.println("Strategy 1 checking homework and homework with bonus are the same: " + hb1.equals(h1));

        //Strategy 2
        Exam e1 = new Exam("Lesson 1 to 4",now,10);
        Exam e2 = new QuizExam("Lesson 1 to 4",now,10,20);
        System.out.println("Strategy 2 checking exam and quiz exam are the same: " + e1.equals(e2));
        Exam e3 =new Exam("Lesson 1 to 5",now,100);
        Exam e4 =new MidtermExam("Lesson 1 to 5",now,100,70);
        System.out.println("Strategy 2 checking exam and midterm exam are the same: " + e3.equals(e4));

        //Strategy 3
        FinalExamWithQuiz f1 = new FinalExamWithQuiz("Lesson 3 to 6",now,20,20,Grade.A);
        FinalExamWithQuiz f2 = new FinalExamWithQuiz("Lesson 3 to 6",now,20,20,Grade.A);
        FinalExamWithQuiz f3 = new FinalExamWithQuiz("Lesson 3 to 6",now,20,20,Grade.C);
        System.out.println("Strategy 3 checking final exams with quiz are the same: " + f1.equals(f2));
        System.out.println("Strategy 3 checking final exams with quiz are the same: " + f1.equals(f3));
    }
}
