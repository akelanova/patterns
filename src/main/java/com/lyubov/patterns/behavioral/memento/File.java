package com.lyubov.patterns.behavioral.memento;

public class File {
    private Save save;
    public Save getSave() {
        return save;
    }
    public void setSave(Save save) {
        this.save = save;
    }
}


