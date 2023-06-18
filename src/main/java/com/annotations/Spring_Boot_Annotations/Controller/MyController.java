package com.annotations.Spring_Boot_Annotations.Controller;

import com.annotations.Spring_Boot_Annotations.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//We can use Restcontroller which works both for conroller and responsebody singly
@Controller
public class MyController {

    @Autowired
    @Qualifier("student1")
    private Student student;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseBody
    //requestBody takes the data in json and then with the help of setter stores data in object of student
    public String home(Student st){
        GmailSender gmailSender = new GmailSender();
        String to = "vivekraj6843@gmail.com";
        String from = "mailtesting673@gmail.com";
        String subject = student.getName();
        String text = student.getName();
        boolean b = gmailSender.sendEmail(to,from,subject,text);
        if(b){
            System.out.println("Email is sent successfully");
        }else{
            System.out.println("There is problem in sending a mail");
        }
        return this.student.getName();
    }
}
