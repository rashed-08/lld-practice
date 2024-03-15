package design_pattern.builder;

public class Client {
    public static void main(String[] args) {
        StudentBuilder builder = new StudentBuilder();
        Student firstStudent = builder.setRollNumber(10).setName("John Doe").setFatherName("Jonathon").setMotherName("Rose").build();
        Student secondStudent = builder.setRollNumber(11).setName("Robi").setFatherName("Rabbi").setMotherName("Noor").setAge(15).build();
        System.out.println(firstStudent.toString());
        System.out.println(secondStudent.toString());
    }
}
