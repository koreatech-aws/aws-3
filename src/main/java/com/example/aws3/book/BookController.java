package com.example.aws3.book;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.aws3.book.dto.BookRequest;
import com.example.aws3.book.dto.BookResponse;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BookController {
    private final BookService bookService;

    @GetMapping("/")
    public String healthCheck() {
        return "HealthCheck";
    }

    @PostMapping("/books")
    public ResponseEntity<?> save(@RequestBody BookRequest.SaveDTO reqDTO) {
        BookResponse.SaveDTO respDTO = bookService.save(reqDTO);
        return ResponseEntity.ok(respDTO);
    }

    @GetMapping("/books")
    public ResponseEntity<?> findAll() {
        List<BookResponse.ListDTO> respDTOs = bookService.findAll();
        return ResponseEntity.ok(respDTOs);
    }
}
