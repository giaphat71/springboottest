package com.svttcntt.javabackend;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    public MyRestController() {
    }

    @GetMapping("/{user}")
    public String getUser(@PathVariable String user) {
        return user.toString();
    }

    @GetMapping("/{user}/customers")
    public List<String> getUserCustomers(@PathVariable String user) {
        var l = new ArrayList<String>();
        l.add("GET "+user);
        return l;
    }


}