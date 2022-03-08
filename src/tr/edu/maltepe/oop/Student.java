package tr.edu.maltepe.oop;

public class Student {
    String firstName;
    String lastName;
     int studentNo;
     private long TCKN;

 public Student(String firstName,String lastName,int studentNo,long TCKN){
   this.firstName = firstName;
   this.lastName = lastName;
   this.studentNo = studentNo;
   this.TCKN = TCKN;
 }





     public void learns(){
     System.out.println("student is learning");
 }
 public void study(){
     System.out.println("student studies");

 }
 public void setTCKN(long TCKN){
     this.TCKN = TCKN;
 }
public long getTCKN(){
     return TCKN;

}
}

