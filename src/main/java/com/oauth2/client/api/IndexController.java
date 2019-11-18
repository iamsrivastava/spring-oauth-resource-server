package com.oauth2.client.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/user")
@RestController
public class IndexController {


    @PreAuthorize("hasAnyAuthority('DELETE_WORKFLOW')")
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String findById() {
        return
                "hello world";

    }

}
