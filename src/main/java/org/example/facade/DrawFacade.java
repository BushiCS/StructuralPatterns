package org.example.facade;

public class DrawFacade {
    private Draw draw;

    public DrawFacade() {
        this.draw = new DrawImpl();
    }


    public void printRectangle(){
        draw.drawLineUp();
        draw.drawLineLeftRight();
        draw.drawLineDown();
    }
}
