//package org.example.reportservice.db.user;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.annotation.Profile;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//@Profile("dev")
//@Component
//public class initClass {
//    @Autowired
//    private UserService userService;
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void init() throws UsernameAlreadyExistsException {
//        User admin = new User("admin", "admin", "admin");
//        User user = new User("admin", "admin");
//        userService.save(admin);
//        userService.save(user);
//    }
//}
