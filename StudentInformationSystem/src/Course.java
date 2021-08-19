public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;


    Course(Teacher teacher, String name, String code, String prefix){
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
    }

    void printTeacher(){
        this.teacher.print();
    }
}
