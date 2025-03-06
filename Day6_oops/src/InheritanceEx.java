class Principal{
    void speak(){
        System.out.println("Principal speaking");
    }
}

class Teacher extends Principal{
    void teach(){
        System.out.println("Teacher teaching");
    }
}

class Student extends Teacher{
    void learn(){
        System.out.println("student learning");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Student objS = new Student();

        objS.learn();
        objS.teach();
        objS.speak();

    }
    }

