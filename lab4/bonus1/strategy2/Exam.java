package lab4.bonus1.strategy2;

import java.time.LocalDate;

public class Exam {
    private String examContent;
    private LocalDate dateAdministered;
    private double score;

    public Exam(String examContent, LocalDate dateAdministered, double score){
        this.examContent = examContent;
        this.dateAdministered = dateAdministered;
        this.score = score;
    }

    public String getExamContent() {
        return examContent;
    }

    public LocalDate getDateAdministered() {
        return dateAdministered;
    }

    public double computeScore(){
        return this.score;
    }

    //Strategy 1 - instanceof
    @Override
    public boolean equals(Object ob) {//Case 1
        if(ob == null) return false;
        if (getClass() != ob.getClass()) return false;
        Exam e = (Exam)ob;
        return e.examContent.equals(examContent) && e.dateAdministered.equals(dateAdministered) && e.score==score;
    }
}
