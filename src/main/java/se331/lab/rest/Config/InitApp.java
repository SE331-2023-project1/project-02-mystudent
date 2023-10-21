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

                .department("CAMT").build());
        userRepository.save(User.builder()

                .department("ECON").build());
    }
}
