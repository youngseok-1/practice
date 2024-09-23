package com.ohgiraffers.test1.sort;

import com.ohgiraffers.test1.model.dto.BookDTO;
import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO book1, BookDTO book2) {
        return Integer.compare(book2.getCategory(), book1.getCategory());
    }
}