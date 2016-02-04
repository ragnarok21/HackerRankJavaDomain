package Collections;

import java.util.*;

/**
 * Created by ramon on 04-02-16.
 */
public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = Integer.parseInt(in.next());
            String fname = in.next();
            double cgpa = Double.valueOf(in.next());

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            in.nextLine();
            testCases--;
        }
        Collections.sort(studentList,new CompareStudents());
        Collections.reverse(studentList);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class CompareStudents implements Comparator<Student>{
    public int compare(Student a, Student b) {
        if(a.getCgpa()!=b.getCgpa()){
            return Double.compare(a.getCgpa(), b.getCgpa());
        }else{
            if(a.getFname()!=b.getFname()){
                return b.getFname().compareTo(a.getFname());
            }else{
                return Integer.compare(a.getId(),b.getId());
            }

        }
    }
}


