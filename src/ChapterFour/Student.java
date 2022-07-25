package ChapterFour;

public class Student {
    private String name;
    private double average;
    public Student(String name,double average) {
        this.name = name;
        this.average = average;
    }


    public void setName(String name) {
        this.name =name;
    }

    public String getName() {
        return  name;
    }

    public void setAverage(double average) {
        if(average >0.00){
            if(average<= 100){
                this.average = average;
            }
        }
    }

    public double getAverage() {
        return  average;
    }

    public String getLetterGrade() {
        String letterGrade;
        if (average >= 90.0) {
            letterGrade = "A";
        }
         else if (average >= 80.0) {
            letterGrade = "B";
        }
         else if (average >= 70.0) {
            letterGrade = "C";
        }
        else if (average >= 60.0) {
            letterGrade = "D";
        }
        else {
            letterGrade = "F";
        }
        return letterGrade;
    }

    public String showMessage() {
        String showMessage ="";

        if (average >= 90.0) {
            showMessage  = "You have done excellently well,so proud of you!";
        }
        else if (average >= 80.0) {
            showMessage = "You have done excellently well,keep it up!";
        }
        else if (average >= 70.0) {
            showMessage = "Good result,Dont relent.Give it all it takes to be better";
        }
        else if (average >= 60.0) {
            showMessage = "Average grade,but you are made for the top ";
        }
        else {
            showMessage= " Ooops!,you are not a failure,i believe in you abilities";
        }
        return showMessage;
    }
}
