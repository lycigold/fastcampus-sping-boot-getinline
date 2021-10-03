package com.fastcampuus.getinline.domain;

import com.fastcampuus.getinline.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {
    private Long id;

    private Long PlaceId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime0;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
