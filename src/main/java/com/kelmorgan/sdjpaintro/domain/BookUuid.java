package com.kelmorgan.sdjpaintro.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class BookUuid {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "binary(16)", updatable = false, nullable = false)
    private UUID id;

    private String title;
    private String isbn;
    private String publisher;
}
