package tr.edu.maltepe.oop;

public class Prof extends Person{
    private String lesson;



    public Prof(String lesson){
        super("k","l",22);

        this.lesson=lesson;
    }


    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void teaches () {
        System.out.println(getName() +" is teaching " +lesson);
    }
}
