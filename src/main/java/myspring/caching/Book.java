package myspring.caching;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@ToString
@Entity
public class Book {
    String name;
    @Id
    Long id;
}
