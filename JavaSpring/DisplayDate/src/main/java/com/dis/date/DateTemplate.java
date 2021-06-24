package com.dis.date;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DateTemplate {
@RequestMapping("/date")

public String date(Model model) {
    java.util.Date date = new java.util.Date() ;
    SimpleDateFormat formattedAsDate = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
	model.addAttribute("date", formattedAsDate.format(date));
    return "Date.jsp";
}@RequestMapping("/time")
public String time(Model model) {
    java.util.Date time = new java.util.Date() ;
    SimpleDateFormat formattedAsTime = new SimpleDateFormat("h:mm a");
	model.addAttribute("time", formattedAsTime.format(time));
    return "Time.jsp";
}
}