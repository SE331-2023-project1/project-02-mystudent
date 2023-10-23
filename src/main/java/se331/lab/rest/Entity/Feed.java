package se331.lab.rest.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Feed {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String name;
    String type;
    String uploader;
    @Lob
            @Column(name = "fileData",length = 10000)
    byte[] fileData;
}
