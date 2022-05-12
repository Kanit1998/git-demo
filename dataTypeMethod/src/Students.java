import java.util.Objects;

public class Students {


    private String StudentName;
    private String Address;
    private int MobileNumber;
    private int PinCode;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students students = (Students) o;
        return MobileNumber == students.MobileNumber && PinCode == students.PinCode && Objects.equals(StudentName, students.StudentName) && Objects.equals(Address, students.Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentName, Address, MobileNumber, PinCode);
    }

    @Override
    public String toString() {
        return "Students{" +
                "StudentName='" + StudentName + '\'' +
                ", Address='" + Address + '\'' +
                ", MobileNumber=" + MobileNumber +
                ", PinCode=" + PinCode +
                '}';
    }
}
