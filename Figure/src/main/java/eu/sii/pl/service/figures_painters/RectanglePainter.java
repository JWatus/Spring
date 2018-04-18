package eu.sii.pl.service.figures_painters;

import eu.sii.pl.model.Figure;
import eu.sii.pl.service.interfaces.Painter;
import org.springframework.stereotype.Service;

@Service
public class RectanglePainter implements Painter {

    @Override
    public String paint(Figure figure) {
        return "<div style='height: " + 20 + "px; width: " + 40 +
                "px; background-color: LawnGreen'></div>";
    }
}
