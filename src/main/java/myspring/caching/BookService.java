package myspring.caching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    public static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        LOGGER.info("Adding the Book: " + book);
        return bookRepository.save(book);
    }

    public int updateBook(Book book) {
        LOGGER.info("Updating the book: "+book);
        return bookRepository.updateAddress(book.getId(),book.getName());
    }
}
