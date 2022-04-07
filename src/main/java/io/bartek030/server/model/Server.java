package io.bartek030.server.model;

import io.bartek030.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity // represent a table from database - later need to specify ID
@Data // for getters and setters
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id // next field is ID
    @GeneratedValue(strategy = AUTO) // method of generation ID
    private Long id;
    @Column(unique = true) // next field can't have the same value in multiple records
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
