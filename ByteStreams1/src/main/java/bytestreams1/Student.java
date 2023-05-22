package bytestreams1;

import java.io.Serializable;

public class Student implements Serializable {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
    

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
