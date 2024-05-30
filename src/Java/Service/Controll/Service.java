package Java.Service.Controll;

import Java.Domain.Contracts.ControllersMedia;
import Java.Domain.Models.Audio;

import java.util.ArrayList;

public class Service implements ControllersMedia {
    private final ArrayList<Audio> audioList;
    private float actualAudioIndex = 0;

    public Service(ArrayList<Audio> audioList) {
        this.audioList = audioList;
    }

    public String play() {
        Audio atualAudio = audioList.get((int) this.actualAudioIndex);
        return atualAudio.showInfo();
    }

    @Override
    public void next() {
        if (actualAudioIndex < audioList.size() -1) {
            actualAudioIndex++;
        } else {
            actualAudioIndex = 0;
        }
    }

    @Override
    public void previous() {
        if(actualAudioIndex  <= 0 ) {
            actualAudioIndex = audioList.size() -1;
        } else {
            actualAudioIndex--;
        }
    }
}
