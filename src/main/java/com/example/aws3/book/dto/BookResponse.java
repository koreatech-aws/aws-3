package com.example.aws3.book.dto;

import com.example.aws3.book.Book;

import lombok.Getter;
import lombok.Setter;

public class BookResponse {

    @Getter
    @Setter
    public static class SaveDTO {
        private Integer id;
        private String title;
        private String content;
        private String author;

        public SaveDTO(Book book) {
            this.id = book.getId();
            this.title = book.getTitle();
            this.content = book.getContent();
            this.author = book.getAuthor();
        }
    }

    @Getter
    @Setter
    public static class ListDTO {
        private Integer id;
        private String title;
        private String content;
        private String author;

        public ListDTO(Book book) {
            this.id = book.getId();
            this.title = book.getTitle();
            this.content = book.getContent();
            this.author = book.getAuthor();
        }
    }
}
