package jp.co.metateam.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;


// @Controller
// public class BookEditController {

//     @Autowired
//     private BookMstService bookService;

//     // 編集画面に遷移するためのメソッド
//     @GetMapping("/book/edit")
//     public String showEditPage(@RequestParam("id") Long id, Model model) {
//         // サービスを使って書籍情報を取得
//         Book book = bookService.findById(id);

//         // 取得した書籍情報をモデルに渡す
//         model.addAttribute("book", book);

//         // edit.htmlに遷移
//         return "edit";  // これはedit.htmlを返す
//     }

//     // 書籍情報の更新処理を行うメソッド
//     @PostMapping("/book/update")
//     public String updateBook(@ModelAttribute Book book) {
//         // 書籍情報の更新を行う
//         bookService.updateBook(book);

//         // 更新後に書籍一覧ページにリダイレクト
//         return "redirect:/books";
//     }
// }