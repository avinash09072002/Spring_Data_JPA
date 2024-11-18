package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.NoArgsConstructor; // Add Lombok NoArgsConstructor

@Data
@RequiredArgsConstructor
@NoArgsConstructor // This ensures a default constructor is available
@Entity
@Table(name="ARTIST_INFO")
public class Artist {

    @Id
    @Column(name="AID")
    @SequenceGenerator(name = "gen1", sequenceName = "artist_seq", initialValue = 100, allocationSize = 1)
    @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
    private Integer aid;

    @Column(name="ANAME", length = 20)
    @NonNull
    private String aname;

    @Column
    @NonNull
    private String category;

    @NonNull
    private double fee;

}
