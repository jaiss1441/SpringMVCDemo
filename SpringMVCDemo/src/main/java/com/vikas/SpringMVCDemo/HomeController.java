package com.vikas.SpringMVCDemo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "index";
    }


//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result",result);
//        System.out.println(result);
//        return "result.jsp";
//    }


//    @RequestMapping("/add")
//    public String add(int num1,int num2 ,HttpSession session){
////if name of variable is in URL and in method same it  mapped automatic
//        int result = num1 + num2;
//        session.setAttribute("result",result);
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2 ,HttpSession session){
//    //Other wise we can with help of RequestParam annotation
//        int result = num1 + num2;
//        session.setAttribute("result",result);
//        return "result.jsp";
//    }

//@RequestMapping("/add")
//public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2 , Model model){
//    //using Model interface rather than HttpSession on servlet
//    int result = num1 + num2;
//    model.addAttribute("result",result);
//    return "result";
//}

@RequestMapping("/add")
public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2 , ModelAndView mv){
    //using ModelAndView object
    int result = num1 + num2;
    mv.addObject("result",result);
    mv.setViewName("result");
    return mv;
}

@RequestMapping("addAlien")
public String addAlien(Alien alien){
    //using ModelAndView object
    return "result";
}
@ModelAttribute("course")
public String courseName(){
    return"java";
}
}
