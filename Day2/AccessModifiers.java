package Day2;


class Student{
    private int studentId;
    private String name;
    private int passMark = 40;

    public Student(int studentId, String name) throws Exception {
        setStudentId(studentId);
        setName(name);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) throws Exception{
        if(studentId < 0) throw new Exception("Id cannot be negative");
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if(name.isEmpty()) throw new Exception("Name cannot be empty");
        this.name = name;
    }

    public int getPassMark() {
        return passMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", passMark=" + passMark +
                '}';
    }

    public static boolean checkName(Student s1, Student s2){
        if (s1.getName().equals(s2.getName())) return true;
        return false;
    }
}


public class AccessModifiers {

    public static void main(String[] args) throws Exception {
        Student student1 = new Student(10, "John");
        Student student2 = new Student(11, "John");
        Student student3 = new Student(12, "Mary");
        System.out.println(Student.checkName(student1, student2));
        System.out.println(Student.checkName(student2, student3));

        System.out.println(student3.toString());
    }


}
