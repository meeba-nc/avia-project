package ru.ncedu.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @GetMapping("/search/start")
    public String searchPage() {
        return "search/start";
    }

    @PostMapping("/search/result")
    public String searchResult(
        @RequestParam("input-from") String inputFrom,
        @RequestParam("input-to") String inputTo,
        @RequestParam("input-when") String inputWhen) {
        // 2) отправить запрос на поиск в back-end
        //          3) сделать redirect на страницу с результатами поиска
        // 3) полученные данные из back-end (2) вставить в модель thymeleaf
        // 4) return search_result следующая страница с сообщением о том, что данные отправлены
        // !разобраться с получением параметров!
        // @Requestparam html post spring
        return "redirect:/search/result";
    }
    @PostMapping("/search/map")
    public String searchMap() {
        return null;
    }
}
