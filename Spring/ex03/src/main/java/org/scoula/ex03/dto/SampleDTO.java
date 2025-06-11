package org.scoula.ex03.dto;

import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.attribute.PosixFileAttributes;

@Slf4j
@Data
public class SampleDTO {
    private String name;
    private int age;


}
