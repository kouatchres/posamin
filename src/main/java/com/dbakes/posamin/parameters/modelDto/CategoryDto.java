package com.dbakes.posamin.parameters.modelDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {

//    @Size(min=3 , max=15, message="category Name must be between 3 and 15 Charaters")
        private String categoryName;
}
