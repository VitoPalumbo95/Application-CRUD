package com.example.Spring.boot.Project.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String job_title;
    @Column(nullable = false)
    private int salary;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobInfo jobInfo = (JobInfo) o;
        return id != null && Objects.equals(id, jobInfo.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


}
