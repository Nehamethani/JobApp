package com.nekocodes.JobApp;

import com.nekocodes.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {

    @GetMapping({"/", "home"})
    public String home()
    {
        System.out.println("Inside Home controller");
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob()
    {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost)
    {
        return "success";
    }
}
