package com.example.aws3.book;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.aws3.book.dto.BookRequest;
import com.example.aws3.book.dto.BookResponse;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public BookResponse.SaveDTO save(BookRequest.SaveDTO reqDTO) {
        Book bookPS = bookRepository.save(reqDTO.toEntity());
        return new BookResponse.SaveDTO(bookPS);
    }

    public List<BookResponse.ListDTO> findAll() {
        List<Book> bookListPS = bookRepository.findAll();
        List<BookResponse.ListDTO> respDTOs = bookListPS.stream()
                .map((book) -> new BookResponse.ListDTO(book))
                .collect(Collectors.toList());
        return respDTOs;
    }
}
