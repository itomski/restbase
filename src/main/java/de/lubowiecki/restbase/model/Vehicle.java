package de.lubowiecki.restbase.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Getter @Setter
@Data // Enthält Getter und Setter
@NoArgsConstructor // Parameterloser Konstruktor
@AllArgsConstructor // Konstruktor mit allen Parametern
@ToString
@EqualsAndHashCode
//@RequiredArgsConstructor // Nimmt Parameter für final Eingenschaften entgegen
@Builder
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private Brand brand;

    @Column(length = 50)
    private String type;

    @Column(length = 12)
    private String registration;

    @Enumerated(EnumType.STRING)
    private Status status;
}
