package com.telran;

import lombok.*;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.Objects;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        // SneakyThrows

        // try {

        PrintStream stream = new PrintStream(new FileOutputStream(args[0]), true);

        IOUtils.write(args[1], stream);

        stream.close();


        // } catch(Exception e)
        // throw new RuntimeException(e)
        // }

//        var person = Person.builder()
//                .dateOfBirth(LocalDate.now())
//                .firstName("John")
//                .lastName("Doe")
//                .addressInfo(
//                        AddressInfo.builder()
//                                .city("tel-Aviv")
//                                .country("Central")
//                                .street("Rotshild")
//                                .country("Israel")
//                        .build());
    }
}


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private AddressInfo addressInfo;
}

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
class AddressInfo {
    private String street;
    private String houseNumber;
    private String city;
    private String region;
    private String country;
}