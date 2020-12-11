package lesson20.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bosses")
public class Boss {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

//    @Embedded
//    private HumanParameters parameters;

    @OneToMany(mappedBy = "boss", fetch = FetchType.EAGER)
    private Set<Employee> employees;

    @OneToOne(mappedBy = "boss")
    private Branch branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
