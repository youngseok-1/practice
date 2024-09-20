package com.ohgiraffers.test1.run;

import com.ohgiraffers.test1.model.dto.BookDTO;
import com.ohgiraffers.test1.view.BookMenu;

public class Application {

    public static void main(String[] args) {

       BookMenu bookMenu = new BookMenu();
       bookMenu.displayMenu();
    }
}
