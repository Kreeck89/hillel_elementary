package lesson20.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Embedded
    private HumanParameters parameters;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "employee_project",
    joinColumns = @JoinColumn(name = "employee_id"),
    inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "boss_id")
    private Boss boss;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public HumanParameters getParameters() {
        return parameters;
    }

    public void setParameters(HumanParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", parameters=" + parameters +
                ", projects=" + projects +
                ", boss=" + boss +
                '}';
    }
}
