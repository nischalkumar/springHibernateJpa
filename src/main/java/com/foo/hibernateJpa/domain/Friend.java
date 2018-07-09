package com.foo.hibernateJpa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Friend {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Integer id;

   @OneToOne(cascade = CascadeType.ALL)
   User user1;

   @OneToOne(cascade = CascadeType.ALL)
   User user2;
}
