package app.controller;

import app.model.IFigure;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

public class GUISelect {
    private GUIController controller;
    private IFigure selectedShape;

    public GUISelect(GUIController controller) {
        this.controller = controller;
    }

    public void SelectShape(Pane pane, IFigure s2) {
        for (Node s : pane.getChildren()) {
            if (s instanceof IFigure) {
                ((IFigure) s).setUnselected();
            }
        }
        s2.setSelected();
        selectedShape = s2;
    }
    
    public void UnselectAll(Pane pane) {
        for (Node s : pane.getChildren()) {
            if (s instanceof IFigure) {
                ((IFigure) s).setUnselected();
            }
        }
    }

    public IFigure getSelectedShape() {
        return selectedShape;
    }
}
