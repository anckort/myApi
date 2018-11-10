package myapiv4.myapiv4.controllers;


import myapiv4.myapiv4.entities.User;
import myapiv4.myapiv4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller("/user")
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getAll")
    public @ResponseBody
    String getAllUsers(){
        return userService.getAllUser().toString();
    }

    @PostMapping(value = "/saveUser")
    public @ResponseBody
    String saveUser(@RequestParam(name = "username") String username,
                    @RequestParam(name = "first_name") String firstName,
                    @RequestParam(name = "last_name") String lastName){
        User user = new User();
        user.setUsername(username);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        userService.saveUser(user);

        return "ok";
    }
}
