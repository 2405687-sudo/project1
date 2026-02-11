package Day6;

class University {
    String universityName = "KIIT University";
    String location = "Bhubneswar";

    class Department {
        String deptName = "Computer Science";
        String hodName = "Dr. Sharma";

        void display() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    public static void main(String[] args) {
        University uni = new University();
        University.Department dept = uni.new Department();
        dept.display();
    }
}

