package com.etiya.kodlamaio.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetByIdLanguageResponse {
    private int id;
    private String name;
}
