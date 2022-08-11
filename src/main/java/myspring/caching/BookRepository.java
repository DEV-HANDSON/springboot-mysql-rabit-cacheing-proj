package myspring.caching;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional
    @Modifying
    @Query("Update Book u set u.name=?2 Where u.id=?1")
    int updateAddress(long id, String name);
}
