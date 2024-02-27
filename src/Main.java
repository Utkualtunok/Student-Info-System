public class Main {
    public static void main(String[] args) {
        //Öğretmen veri girişi
        Teacher t1 = new Teacher("Mahmut Hoca", "905436547867","MAT");
        Teacher t2 = new Teacher("Anıl Hoca", "5555", "FZK");
        Teacher t3 = new Teacher("Mehmet Hoca", "4444", "KMY");
        //Ders girişi ve öğretmenleri derse atama işlemi
        Course mat = new Course("Matematik", "101","MAT");
        mat.addTeacher(t1);
        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya", "103","KMY");
        kimya.addTeacher(t3);
        //Öğrenci bilgi ve not girişleri
        Student s1 = new Student("Utku","111","4", mat, fizik,kimya );
        s1.mat.sozlu = 30;
        s1.fizik.sozlu = 50;
        s1.kimya.sozlu = 60;
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Ali", "222","4",mat,fizik,kimya);
        s2.mat.sozlu = 10;
        s2.fizik.sozlu = 20;
        s2.kimya.sozlu = 60;
        s2.addBulkExamNote(60,55,20);
        s2.isPass();


    }
}