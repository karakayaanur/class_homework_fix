package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
        Prof prof1 = new Prof("oop");
        prof1.setName("Ensar Gül");
        prof1.setAge(60);
        prof1.setDepartment("software engineeer");
        prof1.setLesson("oop");

        Prof prof2 = new Prof("probability");
        prof2.setName("Hamit Topuz");
        prof2.setAge(53);
        prof2.setDepartment("industry engineer");
        prof2.setLesson("probability and statictic");


        Student student1 = new Student(190704021);
        student1.setName("Nur");
        student1.setAge(21);
        student1.setDepartment("computer engineer");
        student1.setId(190704021);

        Student student2 = new Student(190703215);
        student2.setName("Ecem");
        student2.setAge(22);
        student2.setDepartment("computer engineer");
        student2.setId(190703215);


        System.out.println("prof."+ prof1.getName());
        System.out.println(prof1.getAge());
        System.out.println(prof1.getDepartment());
        prof1.teaches();
        System.out.println("\n");
        System.out.println("prof."+ prof2.getName());
        System.out.println(prof2.getAge());
        System.out.println(prof2.getDepartment());
        prof2.teaches();
        System.out.println("\n");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getDepartment());
        System.out.println(student1.getId() +"");
        student1.learning();
        System.out.println("\n");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getDepartment());
        System.out.println(student2.getId() +"");
        student2.learning();


    }
}
