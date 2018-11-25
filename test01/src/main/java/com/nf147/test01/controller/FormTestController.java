package com.nf147.test01.controller;

import com.nf147.test01.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class FormTestController {

    @GetMapping("/form")
    public String input() {
        return "formtest";
    }

    @GetMapping("/formpost")
    public String input2() {
        return "formtest";
    }

    @PostMapping("/formpost")
    public String input3(MultipartFile ddd, String aaa, int bbb, String ccc) {
        return "formtest";
    }

    @PostMapping("/myupload")
    public @ResponseBody String myupload(MultipartFile fff) throws IOException {
        fff.transferTo(new File("d:/aaa.jpg"));
        return "sucess";
    }

    @GetMapping("/myupload")
    public String myup () {
        return "fileUpload";
    }


}
