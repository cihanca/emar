package com.cihan.emar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {

    private long id;

    private RoomDTO room;

    private CompanyDTO company;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date startDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date endDate;

    private Boolean hasExtra;

    private float cost;

}
