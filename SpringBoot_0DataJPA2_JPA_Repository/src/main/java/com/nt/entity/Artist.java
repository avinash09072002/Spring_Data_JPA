package com.nt.entity;

import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ARTIST_INFO")
public class Artist {
	@Column(name="AID")
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name = "gen1",sequenceName = "artist_seq", initialValue=100, allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Integer aid;
	
	@Column(name="ANAME", length = 10)
	@NonNull                         //always choose as ...lombok
	private String aname;
	
	@Column(length = 10)
	@NonNull
	private String catagory;
	@NonNull
	@Column(length = 10)
	private double fee;

}
