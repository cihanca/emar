package com.cihan.emar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {

    private long id;

    private String name;

    private String mail;

    private String city;

    private int memberCount;

}
