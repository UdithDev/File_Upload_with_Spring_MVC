package lk.ijse.file_uploading.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Image {
    @Id

    private Integer id;
    private String fileString;

    public Image(String fileString) {
        this.fileString = fileString;
    }
}
