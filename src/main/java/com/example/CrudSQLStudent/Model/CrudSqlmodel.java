package com.example.CrudSQLStudent.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "crudstud")
public class CrudSqlmodel {

    @Id
    @Column(name = "sid")
    private int sid;
    @Column(name = "stud_name")
    private String sname;
    @Column(name = "college")
    private String scollege;
    @Column(name = "yearofpassing")
    private int yearofpassing;

    public int getSid(){
        return sid;
    }
    public void setSid(int sid){
        this.sid = sid;
    }
    public String getSname(){
        return sname;
    }
    public void setSname(String sname){
        this.sname = sname;
    }
    public String getScollege(){
        return scollege;
    }
    public void setScollege(String scollege){
        this.scollege = scollege;
    }
    public int getYearofpassing(){
        return yearofpassing;
    }
    public void setYearofpassing(int yearofpassing){
        this.yearofpassing = yearofpassing;
    }

    public String toString(){
        return "CrudSqlmodel[sid="+sid+", sname="+sname+", scollege="+scollege+", yearofpassing="+yearofpassing+"]";
    }

}
