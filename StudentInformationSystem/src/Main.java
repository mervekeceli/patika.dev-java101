public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "05472351223", "MAT");
        Teacher t2 = new Teacher("Ghram Bell","05467383542","FZK");
        Teacher t3 = new Teacher("Külyutmaz", "056789000334","BIO");

        Course math = new Course(t1, "Tarih","101","MAT");
        math.addTeacher(t1);

        Course physical = new Course(t2, "Edebiyat","102","FZK");
        physical.addTeacher(t2);

        Course biology = new Course(t3, "Biyoloji", "103","BIO");
        biology.addTeacher(t3);

        Student student1 = new Student(math, math, physical, physical, biology, biology, "İnek Şaban", "209","4");
        student1.addBulkExamNote(80,20,30,80,90,70);
        student1.isPass();

        Student student2 = new Student(math, math, physical, physical, biology, biology, "Hayta İsmail", "210", "4");
        student1.addBulkExamNote(20,90,50,60,57,76);
        student2.isPass();

        /*Student student = new Student(math, physical , biology,"Merve","G181210054","4");
        student.addBulkExamNote(100,200,80);
        student.isPass(); */
    }
}
