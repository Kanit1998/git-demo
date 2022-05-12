import java.util.Objects;

public class Developers implements Comparable<Developers> {


    private int id;
    private String name;
    private String company;
    private String salary;

    public Developers(int id, String name, String company, String salary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developers)) return false;
        Developers that = (Developers) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(company, that.company) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, salary);
    }

    @Override
    public String toString() {
        return "Developers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }


    @Override
    public int compareTo(Developers o) {
        if (this.id < o.id) {
            return 0;
        } else if (this.name == o.name) {
            return 1;
        } else if (this.company == o.company) {
            return 2;
        } else if (this.salary == o.salary) {
            return 3;
        } else {
            return -1;
        }
    }
}

