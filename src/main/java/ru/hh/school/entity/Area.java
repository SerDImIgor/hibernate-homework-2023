package ru.hh.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area")
//TODO: оформите entity
public class Area {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id")
  private Integer id;

  @Column(name = "name")
  private String name;

  public String getName() {
    return name;
  }
  public Area()
  {
  
  }
  public void setName(String name) {
    this.name = name;
  }
}
