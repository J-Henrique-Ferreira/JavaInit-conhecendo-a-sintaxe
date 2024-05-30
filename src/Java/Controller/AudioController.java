package Java.Controller;

import Java.Domain.Models.Audio;
import Java.Domain.Models.Music;
import Java.Domain.Models.PodCast;
import Java.Service.Controll.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class AudioController {
    static ArrayList<Audio> audioList = new ArrayList<>();
    Service serviceAudios;

    public AudioController() {
        System.out.print("  \n ~`|´~ Welcome to the terminal nightclub ~`|´~ \n\n");
        serviceAudios = new Service(audioList);
    }

    public void handleRequest() {
        Scanner scanner = new Scanner(System.in);
        seedAudios();
        System.out.println(serviceAudios.play());
        boolean isRunningApllication = true;

        while (isRunningApllication) {
            System.out.println("************************************************* \n");

            System.out.println("Press 'N' for next music, 'P' for previous or 'any key' for exit: \n");
            String inputValue = scanner.nextLine().toUpperCase();

            if(inputValue.equals("N")) {
                serviceAudios.next();
                System.out.println(serviceAudios.play());
            }

            if(inputValue.equals("P")) {
                serviceAudios.previous();
                System.out.println(serviceAudios.play());
            }
            else {
                scanner.close();
                isRunningApllication = false;
                System.out.println("Exit running application...");
            }
        }
    }

    private void seedAudios () {
        for (int i = 0; i < 10 ; i++) {
            ArrayList<String> authors = new ArrayList<String>();
            authors.add("Cientistas");
            authors.add("DeDados");

            audioList.add(new PodCast(
                            "Ciencias computacionais ep N-" + i,
                            "4", "hoje",
                            "Ciencia e tenologia",
                            authors,
                            "bloog.tech"
                    )
            );

            audioList.add(new Music(
                            "Baladas Rock para ouvir na estrada V" + i,
                            "4", "hoje",
                            "RelaxMusics",
                            "GuitarsGroup",
                            "bloog.tech"
                    )
            );

        }

    }
}
