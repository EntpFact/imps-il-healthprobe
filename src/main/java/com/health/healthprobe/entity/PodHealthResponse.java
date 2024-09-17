package com.health.healthprobe.entity;

import jakarta.persistence.Entity;
import lombok.*;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PodHealthResponse {


    private int totalPodCount;

    private int totalHealthyPodCount;

    private String applicationHealthStatus;



}
