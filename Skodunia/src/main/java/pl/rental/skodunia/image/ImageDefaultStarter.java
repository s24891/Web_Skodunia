package pl.rental.skodunia.image;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ImageDefaultStarter {

    @EventListener(ApplicationReadyEvent.class)
    public void init(){


    }
}
