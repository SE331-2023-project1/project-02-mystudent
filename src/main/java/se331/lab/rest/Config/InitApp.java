package se331.lab.rest.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.Entity.Teacher;
import se331.lab.rest.Entity.User;
import se331.lab.rest.Repository.TeacherRepository;
import se331.lab.rest.Repository.UserRepository;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final UserRepository userRepository;
    final TeacherRepository teacherRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        teacherRepository.save(Teacher.builder()
                .username("teacher1")
                .password("teacher1")
                .image("")
                .position("Prof.")
                .name("Advisor1")
                .surname("Ajarn")
                .teacherID("001")
                .department("CAMT")
                .build());

        userRepository.save(User.builder()

                .username("student1")
                .password("student1")
                .name("Shoyo")
                .surname("Hinata")
                .studentID("642115001")
                .image("https://live.staticflickr.com/65535/53133553491_793e26edb5_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());


        userRepository.save(User.builder()

                .username("student2")
                .password("student2")
                .name("Kenma")
                .surname("Kotsume")
                .studentID("642115002")
                .image("https://live.staticflickr.com/65535/53134034918_f64107b2ff_o.png")
                .role("student")
                .advisorName("Yasufumi")
                .advisorSurname("Nekomata")
                .advisorImage("https:live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student3")
                .password("student3")
                .name("Tobie")
                .surname("Kakeyama")
                .studentID("642115003")
                .image("https://live.staticflickr.com/65535/53133560466_166806bf86_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student4")
                .password("student4")
                .name("Kuroo")
                .surname("Tetsuro")
                .studentID("642115004")
                .image("https://live.staticflickr.com/65535/53132961792_5b6bede0a8_o.png")
                .role("student")
                .advisorName("Yasufumi")
                .advisorSurname("Nekomata")
                .advisorImage("https:live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student5")
                .password("student5")
                .name("Daichi")
                .surname("Sawamura")
                .studentID("642115005")
                .image("https://live.staticflickr.com/65535/53133968840_72266c8328_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student6")
                .password("student6")
                .name("Lev")
                .surname("Haiba")
                .studentID("642115006")
                .image("https://live.staticflickr.com/65535/53133989210_ac3281d585_o.png")
                .role("student")
                .advisorName("Yasufumi")
                .advisorSurname("Nekomata")
                .advisorImage("https:live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student7")
                .password("student7")
                .name("Koushi")
                .surname("Tsukiwara")
                .studentID("642115007")
                .image("https://live.staticflickr.com/65535/53134061948_4e464cdf6b_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student8")
                .password("student8")
                .name("Shou")
                .surname("Inuoka")
                .studentID("642115008")
                .image("https://live.staticflickr.com/65535/53134061988_7e6a970d77_o.png")
                .role("student")
                .advisorName("Yasufumi")
                .advisorSurname("Nekomata")
                .advisorImage("https:live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student9")
                .password("student9")
                .name("Asahi")
                .surname("Azumane")
                .studentID("642115009")
                .image("https://live.staticflickr.com/65535/53134062198_7f71d8a07c_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student10")
                .password("student10")
                .name("Moritauke")
                .surname("Yaku")
                .studentID("642115010")
                .image("https://live.staticflickr.com/65535/53132982987_dd0dbdc077_o.png")
                .role("student")
                .advisorName("Yasufumi")
                .advisorSurname("Nekomata")
                .advisorImage("https:live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student11")
                .password("student11")
                .name("Takanobu")
                .surname("Aone")
                .studentID("642115011")
                .image("https://live.staticflickr.com/65535/53134062193_b33112ef12_o.png")
                .role("student")
                .advisorName("Takuro")
                .advisorSurname("Oiwake")
                .advisorImage("https:live.staticflickr.com/65535/53133989675_cb25b69df0_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student12")
                .password("student12")
                .name("Kiyoka")
                .surname("Shitaumi")
                .studentID("642115012")
                .image("https://live.staticflickr.com/65535/53132982982_859c79a363_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student13")
                .password("student13")
                .name("Kenji")
                .surname("Futakuchi")
                .studentID("642115013")
                .image("https://live.staticflickr.com/65535/53132982967_f1a812754a_o.png")
                .role("student")
                .advisorName("Takuro")
                .advisorSurname("Oiwake")
                .advisorImage("https:live.staticflickr.com/65535/53133989675_cb25b69df0_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student14")
                .password("student14")
                .name("Hitoka")
                .surname("Yaji")
                .studentID("642115014")
                .image("https://live.staticflickr.com/65535/53133789474_2f944bd92f_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student15")
                .password("student15")
                .name("Kanji")
                .surname("Koganegawa")
                .studentID("642115015")
                .image("https://live.staticflickr.com/65535/53133989540_ab0dfeca3d_o.png")
                .role("student")
                .advisorName("Takuro")
                .advisorSurname("Oiwake")
                .advisorImage("https:live.staticflickr.com/65535/53133989675_cb25b69df0_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student16")
                .password("student16")
                .name("Shibayama")
                .surname("Yuki")
                .studentID("642115016")
                .image("https://live.staticflickr.com/65535/53277085611_dd0b175328_o.jpg")
                .role("student")
                .advisorName("Yasufumi")
                .advisorSurname("Nekomata")
                .advisorImage("https:live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student17")
                .password("student17")
                .name("Nishinoya")
                .surname("Yu")
                .studentID("642115017")
                .image("https://live.staticflickr.com/65535/53277455639_48b0283f0b_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student18")
                .password("student18")
                .name("Nobuyuki")
                .surname("Kai")
                .studentID("642115018")
                .image("https://live.staticflickr.com/65535/53277138646_af3225fb6d_o.jpg")
                .role("student")
                .advisorName("Yasufumi")
                .advisorSurname("Nekomata")
                .advisorImage("https:live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student19")
                .password("student19")
                .name("Kentaro")
                .surname("Kyotani")
                .studentID("642115019")
                .image("https://live.staticflickr.com/65535/53277467694_6a0a64f070_o.png")
                .role("student")
                .advisorName("Takuro")
                .advisorSurname("Oiwake")
                .advisorImage("https:live.staticflickr.com/65535/53133989675_cb25b69df0_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("student20")
                .password("student20")
                .name("Ryunosuke")
                .surname("Tanaka")
                .studentID("642115020")
                .image("https://live.staticflickr.com/65535/53276245422_260bea1647_o.png")
                .role("student")
                .advisorName("Keishin")
                .advisorSurname("Ukai")
                .advisorImage("https:live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .department("CAMT")
                .position("Prof.")
                .build());

        userRepository.save(User.builder()

                .username("teacher1")
                .password("teacher1")
                .name("Keishin")
                .surname("Ukai")
                .image("https://live.staticflickr.com/65535/53133761344_316fb142a6_o.png")
                .role("teacher")
                .position("Prof.")
                .department("CAMT").build());

        userRepository.save(User.builder()

                .username("teacher2")
                .password("teacher2")
                .name("Yasufumi")
                .surname("Nekomata")
                .image("https://live.staticflickr.com/65535/53133764254_86716f4c97_z.jpg")
                .role("teacher")
                .position("Prof.")
                .department("CAMT").build());

        userRepository.save(User.builder()

                .username("teacher3")
                .password("teacher3")
                .name("Takuro")
                .surname("Oiwake")
                .image("https://live.staticflickr.com/65535/53133989675_cb25b69df0_o.png")
                .role("teacher")
                .position("Prof.")
                .department("CAMT").build());
    }
}
