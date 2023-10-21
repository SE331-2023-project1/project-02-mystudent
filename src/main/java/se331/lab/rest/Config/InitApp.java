package se331.lab.rest.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.Entity.User;
import se331.lab.rest.Repository.UserRepository;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final UserRepository userRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        userRepository.save(User.builder()

                .username("student1")
                .password("student1")
                .name("Boo")
                .surname("Bee")
                .studentID("622115018")
                .image("https://freesvg.org/img/1547692485.png")
                .role("student")
                .advisor("teacher1")
                .department("CAMT").build());
        userRepository.save(User.builder()

                .username("student2")
                .password("student2")
                .name("Anna")
                .surname("Bell")
                .studentID("652115007")
                .image("https://freesvg.org/img/1547692485.png")
                .role("student")
                .advisor("teacher1")
                .department("CAMT").build());
        userRepository.save(User.builder()

                .username("teacher1")
                .password("teacher1")
                .name("Oak")
                .surname("Okay")
                .image("https://freesvg.org/img/1547692485.png")
                .role("teacher")
                .position("Prof.")
                .department("CAMT").build());
    }
}
