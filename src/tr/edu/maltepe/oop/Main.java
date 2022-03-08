package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
     Student myStudent = new Student("Nur","Karakaya",200704006,18554637223L);

     myStudent.learns();
     myStudent.study();

     Student myStudent2 = new Student("Ecem","Kuralay",190704028,19245563227L);



     Student myStudent3 = new Student("Miray","Sağlam",190305004,40221746335L);


     professor myProfessor = new professor();
     myProfessor.firstName = "Ensar";
     myProfessor.lastName = "GÜL";
     myProfessor.teaches();
     myProfessor.helps();

     professor myProfessor2 = new professor();
     myProfessor2.firstName = "Raif";
     myProfessor2.lastName = "ÖNVURAL";

     person myPerson = new person();
     myPerson.firstName = "Kayhan";
     myPerson.lastName = "Eceyiş";
     myPerson.teaches();
     myPerson.helps();

     person2 myPerson2 = new person2();
     myPerson2.firstName = "Duygu";
     myPerson2.lastName = "Akan";
     myPerson2.studentNo = 200705008;
     myPerson2.setTCKN(18762534556L);



        System.out.println(myStudent.firstName);
        System.out.println(myStudent.lastName);
        System.out.println(myStudent.studentNo);
        System.out.println(myStudent.getTCKN());


        System.out.println("      ");

        System.out.println(myStudent2.firstName);
        System.out.println(myStudent2.lastName);
        System.out.println(myStudent2.studentNo);
        System.out.println(myStudent2.getTCKN());

        System.out.println("      ");


        System.out.println(myStudent3.firstName);
        System.out.println(myStudent3.lastName);
        System.out.println(myStudent3.studentNo);
        System.out.println(myStudent3.getTCKN());

        System.out.println("      ");

        System.out.println(myProfessor.firstName);
        System.out.println(myProfessor.lastName);

        System.out.println("      ");

        System.out.println(myProfessor2.firstName);
        System.out.println(myProfessor2.lastName);

        System.out.println("      ");

        System.out.println(myPerson.firstName);
        System.out.println(myPerson.lastName);

        System.out.println("      ");

        System.out.println(myPerson2.firstName);
        System.out.println(myPerson2.lastName);
        System.out.println(myPerson2.studentNo);
        System.out.println(myPerson2.getTCKN());
    }
}
