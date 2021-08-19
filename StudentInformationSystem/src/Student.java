public class Student {

    Course course1;
    Course verbalGrade1;
    Course course2;
    Course verbalGrade2;
    Course course3;
    Course verbalGrade3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;


    Student(Course course1, Course verbalGrade1, Course course2, Course verbalGrade2, Course course3, Course verbalGrade3, String name, String stuNo, String classes){
        this.course1 = course1;
        this.verbalGrade1 = verbalGrade1;
        this.course2 = course2;
        this.verbalGrade2 = verbalGrade2;
        this.course3 = course3;
        this.verbalGrade3 = verbalGrade3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int verbalGrade1, int note2, int verbalGrade2, int note3, int verbalGrade3){
        if(note1 >= 0 && note1 <=100)
            this.course1.note = note1;

        if(verbalGrade1 >= 0 && verbalGrade1 <= 100)
            this.verbalGrade1.note = verbalGrade1;

        if(note2 >= 0 && note2 <= 100)
            this.course2.note = note2;

        if(verbalGrade2 >= 0 && verbalGrade2 <= 100)
            this.verbalGrade2.note = verbalGrade2;

        if(note3 >= 0 && note3 <= 100)
            this.course3.note = note3;

        if(verbalGrade3 >= 0 && verbalGrade3 <= 100)
            this.verbalGrade3.note = verbalGrade3;
    }

    void isPass(){
        System.out.println("=========================================");
        this.average = ((this.course1.note * 0.8 + this.verbalGrade1.note * 0.2) +
                (this.course2.note * 0.7 + this.verbalGrade2.note * 0.3) +
                (this.course3.note * 0.8 + this.verbalGrade3.note * 0.2)) / 3;
        if(this.average >= 55){
            System.out.println("Hababam sınıfı uyanıyor!");
        }
        else
            System.out.println("Hababam sınıfı sınıfta kaldı.");


        printNote();
        System.out.println("Ortalamanız: "+ this.average);
    }

    void printNote(){

        System.out.println(course1.name + " Notu:\t" + course1.note + "\tSözlü Notu:\t" + verbalGrade1.note);
        System.out.println(course2.name + " Notu:\t" + course2.note + "\tSözlü Notu:\t" + verbalGrade2.note);
        System.out.println(course3.name + " Notu:\t" + course3.note + "\tSözlü Notu:\t" + verbalGrade3.note);
    }
}
