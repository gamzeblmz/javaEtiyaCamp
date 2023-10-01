package com.etiya.kodlamaio.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTechnologyRequest {
    private String name;
    private int languageId;
}
