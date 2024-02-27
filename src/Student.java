public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    //Öğrenci sınav not girişleri
    void addBulkExamNote(int mat, int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }
    void printNote(){
        System.out.println("******************************");
        System.out.println("Öğrenci Adı : " + this.name );
        System.out.println(mat.name + " Sınav Notu : " + mat.note +" "+ "Sözlü Notu :" + mat.sozlu);
        System.out.println(fizik.name + " Sınav Notu : " + fizik.note +" "+ "Sözlü Notu :" + fizik.sozlu);
        System.out.println(kimya.name + " Sınav Notu : " + kimya.note +" "+ "Sözlü Notu :" + kimya.sozlu);
    }
    void isPass(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    void calcAvarage(){
       double matAverage = (this.mat.note * 0.8 + this.mat.sozlu * 0.2);
       double fzkAverage = (this.fizik.note * 0.8 + this.fizik.sozlu * 0.2);
       double kmyAverage = (this.kimya.note * 0.8 + this.kimya.sozlu * 0.2);

       this.avarage = ( matAverage + fzkAverage + kmyAverage) / 3;

    }
    boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }

}
