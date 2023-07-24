package com.practica.backjava.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VenueID")
    private Integer venueID;

    @Column(name = "Location")
    private String venueLocation;

    @Column(name = "Type")
    private String venueType;

    @Column(name = "Capacity")
    private int venueCapacity;
}
