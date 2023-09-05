package com.example.aws3.book.dto;

import com.example.aws3.book.Book;

import lombok.Getter;
import lombok.Setter;

public class BookRequest {

    @Getter @Setter
    public static class SaveDTO {
        private String title;
        private String content;
        private String author;

        public Book toEntity() {
            return Book.builder()
                    .title(title)
                    .content(content)
                    .author(author)
                    .build();
        }
    }
}
